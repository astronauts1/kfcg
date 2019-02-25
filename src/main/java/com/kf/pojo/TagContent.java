package com.kf.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by 18236 on 2017/9/26.
 */
@Data
public class TagContent implements Serializable {
    private static final long serialVersionUID = -2580940638631777623L;
    private String tcName;

    private int tcId;

    public int getTcId() {
        return tcId;
    }

    public void setTcId(int tcId) {
        this.tcId = tcId;
    }

    public String getTcName() {
        return tcName;
    }

    public void setTcName(String tcName) {
        this.tcName = tcName;
    }
}
