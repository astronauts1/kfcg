package com.kf.pojo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 基本信息对应数据库表push_info
 * Created by 18236 on 2017/9/26.
 */
@Data
public class BaseInfo implements Serializable {
    private static final long serialVersionUID = -3420738225522720247L;
    private Integer piId;
    @Length(min = 4,max = 100,message = "标题长度应在在4-100之间")
    private String piTitle;
    @Length(min=10,max = 2500,message = "内容应在10-2500之间")
    private String piContent;
    private Integer piMc;
    private String mcName;
    private String scName;



    private Integer piSc;
    private String piUser;
    @NotNull(message = "错误的提交")
    private Integer userId;
    @Length(min = 2,max=150,message = "请输入2-150个字符之间的文字")
    private String piAddress;
    private String piImg;
    private int piScan;
    @Length(min=2,max=8,message = "请输入正确的联系人姓名,2-8个字符,例如'王女士'")
    private String piContactPerson;
    @Length(min=11,max = 11,message = "请输入正确的手机号")
    private String piPhone;
    private String piQq;
    @NotNull(message = "错误的提交")
    private Integer piDistrict;
    private String piDistrictName;
    private Timestamp piPushDate;
    private double piChujia;
    private String piScName;
    private String piIp;

    private Integer piZhiding;
    //当前信息状态,0正常,1被删除,2正在审核,
    private Integer status;


}
