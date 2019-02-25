package com.kf.pojo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class Advert  implements Serializable {
    private static final long serialVersionUID = -3993446116251503613L;
    private Integer advertId;
    private String advertPosition;
    private String advertUrl;
    private Integer width;
    private Integer height;
    /**
     * 广告显示效果图片url
     */
    private String demoUrl;
    /**
     * 过期时间
     */
    private Timestamp expireTime;

    /**
     * 广告页面
     */
    private String advertPage;

    private String advertForward;


}
