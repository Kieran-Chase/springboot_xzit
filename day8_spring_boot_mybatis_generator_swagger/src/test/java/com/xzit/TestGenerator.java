package com.xzit;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/21
 */
@SpringBootTest
public class TestGenerator {

    @Test
    public void generator(){
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/mybatis? serverTimezone=GMT%2B8", "root", "15193651772Aa!")
                .globalConfig(builder -> {
                    builder.author("Kieran") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(".\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.xzit") // 设置父包名
                            .moduleName("gene")// 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml,".\\src\\main\\resources\\mapper"));
                            //.pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D://")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("i_emp") // 设置需要生成的表名
                            .addTablePrefix("i_", "c_") // 设置过滤表前缀
                            .entityBuilder().enableLombok() //开启lombok
                            .enableChainModel()//开启链式编程
                            .controllerBuilder().enableRestStyle();//开启restController
                            // .logicDeletePropertyName("deleted")
                            // .logicDeleteColumnName("deleted");//配置逻辑删除处理
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用 Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
