package com.bw.mmcro.web.controller.monitor;

import com.bw.mmcro.common.core.domain.AjaxResult;
import com.bw.mmcro.framework.web.domain.Server;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bw.mmcro.common.core.controller.BaseController;

/**
 * 服务器监控
 *
 * @作者  朱志广
 */
@RestController
@RequestMapping("/monitor/server")
public class ServerController extends BaseController
{
    @PreAuthorize("@ss.hasPermi('monitor:server:list')")
    @GetMapping()
    public AjaxResult getInfo() throws Exception
    {
        Server server = new Server();
        server.copyTo();
        return AjaxResult.success(server);
    }
}
