package com.kf.pojo;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 个人简历实体,对应数据库cv
 * Created by 18236 on 2017/11/2.
 */
@Data
public class Resume implements Serializable {
    private static final long serialVersionUID = 6824015036835824467L;
    private Integer userId;
    private Integer cvId;
    @NotBlank(message = "毕业院校不能为空")
    private String graColl;
    @NotEmpty(message = "出生日期不能为空")
    private String bornYear;
    @NotNull(message = "错误的请求")
    private Integer dreamWork;

    private String scName;

    private String gender;
    private Integer dreamDistrict;
    @NotBlank(message = "籍贯不能为空")
    private String jiguan;
    @NotBlank(message = "民族不能为空")
    private String minzu;
    private Integer tall;
    @NotNull(message = "错误的请求")
    private Integer maritalStatus;
    @NotNull(message = "错误的请求")
    private String maxEdu;
    @NotEmpty(message = "毕业时间不能为空")
    private String graDate;

    private String stuPro;
    private String english;
    private String computer;
    @NotBlank(message = "错误的请求")
    private String jobYear;
    private String jobDetail;
    private String income;
    private String jineng;
    private String zitui;
    private String phone;
    private String email;
    private String qq;
    @NotBlank(message = "真实姓名不能为空")
    private String realName;
    private Integer weight;
    private Integer health;
    private String cvImg;
    private String otherStu;
    private String workTime;
    private Integer openFlag;
    private Timestamp updateTime;
    private Integer status;
    private String dreamWorkStr;
    private String districtName;
}
