package com.kf.pojo;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 该表用于用户举报信息
 * Created by 18236 on 2017/10/14.
 */
@Data
public class Tip implements Serializable {
    private static final long serialVersionUID = -5193119984852341182L;
    private Integer piId;
    private Integer userId;
    private String tipContent;
    private Integer tipId;
    private Integer tipStatus;
    private Timestamp tipCreatetime;


}
