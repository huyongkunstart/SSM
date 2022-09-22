package com.hu.controller;

import org.junit.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * @author huyongkun
 * @ClassName FileUpAndDownController
 * @create 2022-09-16 11:08
 * @Version 1.0
 * @description: 上传和下载文件
 */

/*
    ResponseEntity:可以作为控制器方法的返回值，表示响应到浏览器的完整的响应报文

   1.文件上传步骤
        1.添加文件上传依赖 commons-fileupload
        2.配置文件上传解析器 (CommonsMultipartResolver类)
        3.套用模板 (修改路径即可)

   2.文件下载步骤
        1.套用模板（修改路径即可）
*/
@Controller
public class FileUpAndDownController {
    @RequestMapping("/test/down")
    public ResponseEntity<byte[]> testResponseEntity(HttpSession session) throws IOException {
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        //获取服务器中文件的真实路径
        String realPath = servletContext.getRealPath("img");
        realPath = realPath+ File.separator+"123.jpg";
        //创建输入流
        InputStream is = new FileInputStream(realPath);
        //创建字节数组 is.available()获取输入流所对应文件的字节数
        byte[] bytes = new byte[is.available()];
        //将流读到字节数组中
        is.read(bytes);

        //创建HttpHeaders对象设置响应头信息
        MultiValueMap<String, String> headers = new HttpHeaders();
        //设置要下载方式以及下载文件的名字
        headers.add("Content-Disposition", "attachment;filename=123.jpg");
        //设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;
        //创建ResponseEntity对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, statusCode);
        //关闭输入流
        is.close();
        return responseEntity;
    }

    @RequestMapping("/test/up")
    public String testup(HttpSession session, MultipartFile photo) throws IOException {
        //获取上传的文件的文件名
        String fileName = photo.getOriginalFilename();
        //处理文件重名问题
        String hzName = fileName.substring(fileName.lastIndexOf("."));
        fileName = UUID.randomUUID().toString() + hzName;

        //获取服务器中photo目录的路径
        ServletContext servletContext = session.getServletContext();
        String photoPath = servletContext.getRealPath("photo");
        System.out.println("photoPath:"+photoPath);
        File file = new File(photoPath);
        if(!file.exists()){
            file.mkdirs();
        }
        String finalPath = photoPath + File.separator + fileName;
        //实现上传功能
        photo.transferTo(new File(finalPath));
        return "success";
    }


}
