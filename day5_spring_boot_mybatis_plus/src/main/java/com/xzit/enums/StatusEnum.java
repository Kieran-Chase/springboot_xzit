package com.xzit.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/19
 */
public enum StatusEnum {
    IN(0,"入库"),
    OUT(1,"出库");

    StatusEnum(Integer statusValue ,String statusDesc){
        this.statusValue=statusValue;
        this.statusDesc=statusDesc;
    }

    @EnumValue
    private final Integer statusValue;
    private final String statusDesc;

    public String toString(){
        return this.statusDesc;
    }
}
