package com.xzit.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="学生对象",description="学生对象，用于对应数据库表student")
public class Student {
    @ApiModelProperty(value="学生id",required=true,example = "1")
    private int id;
    @ApiModelProperty(value="学生姓名",required=true,example = "李四")
    private String name;
    @ApiModelProperty(value="学生性别",required=true,example = "男")
    private String gender;
    @ApiModelProperty(value="学生年龄",required=false,example = "66")
    private int age;

}
