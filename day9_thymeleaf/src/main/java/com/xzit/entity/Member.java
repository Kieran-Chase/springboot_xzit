package com.xzit.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName member
 */
@TableName(value ="member")
@Data
public class Member {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 会员姓名
     */
    private String memberName;

    /**
     * 会员等级
     */
    private Integer level;

    /**
     * 入会时间
     */
    @TableField(fill= FieldFill.INSERT)
    private Date createTime;

    /**
     * 是否删除
     */
    private Integer deleted;
}