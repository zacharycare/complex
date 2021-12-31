package com.az.complex.core.auth.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("public.user")
public class User extends BaseEntity{

    private String id;

    private String username;

    private String password;

    private String nickName;

    private Integer gender;

    private Date birthday;

    private String avatar;

    private String phoneNum;

    private Integer status;
}
