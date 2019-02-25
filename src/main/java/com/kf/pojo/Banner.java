package com.kf.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by 18236 on 2017/11/17.
 */
@Data
public class Banner extends Advert implements Serializable {
    private static final long serialVersionUID = 8525916970948077924L;
    private String bannerTitle;
    private String bannerContent;
    private Integer bannerId;


}
