package com.bw.mmcro.traces.domain.vo;

/**
 * @author 朱志广
 * @Date  2021/10/23 0023
 * @Param 图片上传VO
 * @return
 **/
public class CropsImageVo {

    //作物生长全局图片
    private String imageBase64;

    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    @Override
    public String toString() {
        return "CropsImageVo{" +
                "imageBase64='" + imageBase64 + '\'' +
                '}';
    }
}
