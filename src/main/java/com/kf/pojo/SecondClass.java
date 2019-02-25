package com.kf.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by 18236 on 2017/9/25.
 */
@Data
public class SecondClass implements Serializable {
    private static final long serialVersionUID = -3800427506405883399L;
    private int scId;
    private String scName;
    private int scMcId;
    private int scClickNums;
}
