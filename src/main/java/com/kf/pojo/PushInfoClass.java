package com.kf.pojo;


import lombok.Data;

import java.io.Serializable;

@Data
public class PushInfoClass implements Serializable {
    private static final long serialVersionUID = -1776559059917773318L;
    private int picId;
    private int mcId;
    private String picName;

}
