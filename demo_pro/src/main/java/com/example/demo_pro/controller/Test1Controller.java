package com.example.demo_pro.controller;


import com.example.demo_pro.prjo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class Test1Controller {
    @RequestMapping("/test")
    //形参为什么不能是int，因为有可能参数是空，而int是数据类型不能为空
    public String equals(String name,Integer age) {
        System.out.println(name+":"+age);
        return "ok";
    }

    @RequestMapping("/arrayParam")
    //形参为什么不能是int，因为有可能参数是空，而int是数据类型不能为空
    public String test1(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "ok";
    }
    @RequestMapping("/listParam")
    //形参为什么不能是int，因为有可能参数是空，而int是数据类型不能为空
    public String test2(@RequestParam List<String> hobby) {
        System.out.println(hobby);
        return "ok";
    }

    @RequestMapping("/TimeParam")
    //形参为什么不能是int，因为有可能参数是空，而int是数据类型不能为空
    public String test3(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
        System.out.println(updateTime);
        return "ok";
    }

    @RequestMapping("/JsonParam")
    //形参为什么不能是int，因为有可能参数是空，而int是数据类型不能为空
    public String test4(@RequestBody User user) {
        System.out.println(user);
        return "ok";
    }

    @RequestMapping("/path/{id}/{name}")
    //形参为什么不能是int，因为有可能参数是空，而int是数据类型不能为空
    public String test5(@PathVariable Integer id,@PathVariable String name) {
        System.out.println(id+":"+name);
        return "ok";
    }


}
