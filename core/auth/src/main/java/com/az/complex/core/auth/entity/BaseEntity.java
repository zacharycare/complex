package com.az.complex.core.auth.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {

    private String createdBy;

    @TableField(fill = FieldFill.INSERT)
    private Date createdDate;

    private String updatedBy;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatedDate;

    private String isDel;
}
