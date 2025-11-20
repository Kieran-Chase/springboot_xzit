package com.xzit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/20
 */
@Data
public class Emp {
    @TableId(type= IdType.AUTO)
    private Integer id;
    private String name;
    private String addr;
}
