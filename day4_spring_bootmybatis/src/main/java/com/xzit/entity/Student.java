package com.xzit.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/16
 */
@Data
@ApiModel("学生对象")
public class Student {
    @ApiModelProperty("学生id")
    private Integer id;
    @ApiModelProperty("学生姓名")
    private String name;
    @ApiModelProperty("学生年龄")
    private Integer age;
    @ApiModelProperty("学生性别")
    private String gender;
}
