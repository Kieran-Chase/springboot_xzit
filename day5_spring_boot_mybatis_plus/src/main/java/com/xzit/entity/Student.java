package com.xzit.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/18
 */
@Data
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private Integer tid;
    @TableField(exist=false)
    private String teacherName;
}
