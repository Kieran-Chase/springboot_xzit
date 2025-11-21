package com.xzit.gene.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/11
 */
@Configuration
public class Swagger3Config {
    @Bean
    public Docket apiConfig(){
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                //设置通过什么方法定位到需要生成文档的接口
                //定位了方法上的ApiOperation
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                //接口URL路径，any表示全部路径 .regex("/student/*")
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("szb项目")
                .description("项目描述信息")
                .contact(new Contact("史老师","http://www.itszb.com","2332423523@qq.com"))
                .version("1.0")
                .build();
    }
}
