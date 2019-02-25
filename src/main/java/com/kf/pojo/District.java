package com.kf.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by 18236 on 2017/9/26.
 */
@Data
public class District implements Serializable {
    private static final long serialVersionUID = 3372279707195708858L;
    private int districtId;
    private String districtName;
}
