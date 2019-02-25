package com.kf.pojo;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 用户实体类
 * Created by 18236 on 2017/9/24.
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 6291491221569879221L;
    @Length(min=4,max=16,message = "用户名长度必须在4-16个字符之间!")
    private String userName;
    @Length(min=6,max=20,message = "密码长度必须在6-20个字符之间!")
    private String userPassword;
    @Length(min=11,max=11,message = "请输入正确的手机号!")
    private String userPhone;

    private String userEmail;
    private Integer userId;
    private Timestamp createTime;
    private Timestamp lastedTime;
    private String userDescription;
    private Integer status;
    private Integer userPush;
    private Integer userCollection;
    private String userImg;
    /**
     * 公司是否认证,0未认证,1已认证
     */
    private Integer userAttc;


}
