package com.xzit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("teacher")
public class Teacher {
    @TableId(type= IdType.AUTO)
    private Integer id;
    private String teacherName;
    private String gender;
    private Integer age;
    private Integer deleted;
}
