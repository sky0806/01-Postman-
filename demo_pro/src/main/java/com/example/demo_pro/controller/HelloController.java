package com.example.demo_pro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//restController 请求处理类的标识
//本类是实现Springbootweb的快速入门
@RestController
public class HelloController {
    //声明Hello在何种情况下使用
    @RequestMapping("/Hello")
    public String Hello(){
        System.out.println("HelloWorld!");
        return "ok";
    }
}
