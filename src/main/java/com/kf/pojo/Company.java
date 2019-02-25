package com.kf.pojo;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

@Data
public class Company implements Serializable {

    private static final long serialVersionUID = 3077533316215775185L;
    private Integer companyId;
    private Integer cpUser;

    private Integer cpSc;
    @NotBlank(message = "企业名称不可为空!")
    private String cpName;
    @NotBlank(message = "企业联系人不可为空!")
    private String cpContactPerson;
    private String cpAddress;
    private String cpNet;

    @NotBlank(message = "企业联系方式不可为空!")
    private String cpContact;

    private String cpDescription;
    /**
     * 公司介绍图片
     */
    private String cpImg;
    /**
     * 公司注册号
     */
    @NotBlank(message = "企业注册号不可为空")
    private String cpNum;
    /**
     * 公司营业执照图片
     */
    private String cpPzImg;


}
