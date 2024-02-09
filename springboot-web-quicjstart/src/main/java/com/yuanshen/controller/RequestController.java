package com.yuanshen.controller;

import com.yuanshen.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class RequestController {
    @RequestMapping("/simpleParam")
    public String simpleParam(String name,Integer age){
        System.out.println(name+" "+age);
        return "OK";
    }

    @RequestMapping("/complexParam")
    public String complexParam(User user){
        System.out.println(user);
        return "OK";
    }
    @RequestMapping("/TimeParam")
    public String complexParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime){
        System.out.println(updateTime);
        return "OK";
    }
}

