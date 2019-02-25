package com.kf.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 18236 on 2017/9/25.
 */
@Data
public class MainClass implements Serializable {
    private static final long serialVersionUID = 3076191270584341887L;
    private int mcId;
    private String mcImg;
    private String mcName;
    private int mcClickNums;


}
