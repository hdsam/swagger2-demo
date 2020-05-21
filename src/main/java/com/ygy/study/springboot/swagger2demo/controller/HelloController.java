package com.ygy.study.springboot.swagger2demo.controller;

import com.ygy.study.springboot.swagger2demo.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }

    @ApiOperation("获取用户")
    @PostMapping("user")
    public User getUser(User user){
        return user;
    }
}
