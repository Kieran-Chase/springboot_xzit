package com.xzit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/24
 */
@Controller
public class UploadController {
    @Value("${savePath}")
    private String savePath;

    @GetMapping("up")
    public String goUpload(){
        return "upload";
    }

    @PostMapping("upload")
    @ResponseBody
    public Object upload(String name, MultipartFile file) throws IOException {
        //a.jpg
        //UUID.jpg
        String srcName=file.getOriginalFilename();//获取文件原始名
        String extName=srcName.substring(srcName.lastIndexOf("."));//.jpg
        String fileName=System.currentTimeMillis()+extName;
        File dir = new File(savePath);
        /*File dir=new File(savePath);*/
        dir.mkdirs();//创建保存路径
        FileCopyUtils.copy(file.getInputStream(),new FileOutputStream(new File(dir,fileName)));
        System.out.println(name);
        return "ok";
    }

}
