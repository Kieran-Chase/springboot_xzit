package com.xzit.gene.util;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.annotation.sql.DataSourceDefinitions;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/21
 */
/*
 返回结果
 */
@Data
@Accessors(chain = true)
public class Result {
    //操作是否成功
    private Boolean isSuccess;
    //状态码
    private Integer code;
    //消息
    private String message;
    //返回操作数据
    private Map<String,Object> data;

    public static Result success(){
        return new Result().setIsSuccess(true)
                .setCode(ResultCode.SUCCESS)
                .setMessage("操作成功")
                .setData(new HashMap<>());
    }
    public static Result error(){
        return new Result().setIsSuccess(false)
                .setCode(ResultCode.ERROR)
                .setMessage("操作失败")
                .setData(new HashMap<>());
    }

    public Result setData(HashMap<String,Object> data){
        this.data = data;
        return this;
    }

    public Result setData(String key,Object value){
        this.data.put(key, value);
        return this;
    }
}
