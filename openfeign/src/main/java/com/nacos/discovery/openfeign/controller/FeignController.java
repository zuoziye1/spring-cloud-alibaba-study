package com.nacos.discovery.openfeign.controller;

import com.nacos.discovery.openfeign.feign.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 姚飞虎
 * @Date: 2021/12/3 11:38 上午
 * @Description:
 */
@RestController
public class FeignController {

    @Autowired
    NameService nameService;

    @GetMapping("/hello")
    public String hello(String name){
        return nameService.hello(name);
    }
}
