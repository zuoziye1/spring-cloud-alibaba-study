package com.nacos.discovery.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 姚飞虎
 * @Date: 2021/12/3 11:47 上午
 * @Description:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name){
        return "hello,"+name ;
    }
}
