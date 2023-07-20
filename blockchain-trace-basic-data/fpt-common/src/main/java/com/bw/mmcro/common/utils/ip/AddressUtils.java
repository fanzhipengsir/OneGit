package com.bw.mmcro.common.utils.ip;

import com.bw.mmcro.common.config.FptConfig;
import com.bw.mmcro.common.constant.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.alibaba.fastjson.JSONObject;
import com.bw.mmcro.common.utils.StringUtils;
import com.bw.mmcro.common.utils.http.HttpUtils;

/**
 * 获取地址类
 *
 * @作者  朱志广
 */
public class AddressUtils
{
    private static final Logger log = LoggerFactory.getLogger(AddressUtils.class);

    // IP地址查询
    public static final String IP_URL = "http://whois.pconline.com.cn/ipJson.jsp";

    // 未知地址
    public static final String UNKNOWN = "XX XX";

    public static String getRealAddressByIP(String ip)
    {
        String address = UNKNOWN;
        // 内网不查询
        if (IpUtils.internalIp(ip))
        {
            return "内网IP";
        }
        if (FptConfig.isAddressEnabled())
        {
            try
            {
                String rspStr = HttpUtils.sendGet(IP_URL, "ip=" + ip + "&json=true", Constants.GBK);
                if (StringUtils.isEmpty(rspStr))
                {
                    log.error("获取地理位置异常 {}", ip);
                    return UNKNOWN;
                }
                JSONObject obj = JSONObject.parseObject(rspStr);
                String region = obj.getString("pro");
                String city = obj.getString("city");
                return String.format("%s %s", region, city);
            }
            catch (Exception e)
            {
                log.error("获取地理位置异常 {}", ip);
            }
        }
        return address;
    }
}
