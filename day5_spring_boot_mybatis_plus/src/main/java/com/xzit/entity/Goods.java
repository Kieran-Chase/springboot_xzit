package com.xzit.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.xzit.enums.StatusEnum;
import lombok.Data;
import org.apache.ibatis.type.LocalDateTimeTypeHandler;

import java.time.LocalDateTime;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/19
 */
@Data
@TableName("goods")
public class Goods {
    @TableId(type= IdType.AUTO)
    private Integer id;
    private String name;
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(fill =FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    //创建枚举类型
    private StatusEnum status;

}
