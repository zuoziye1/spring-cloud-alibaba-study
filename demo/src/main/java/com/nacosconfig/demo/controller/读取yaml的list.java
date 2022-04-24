package com.nacosconfig.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 姚飞虎
 * @Date: 2022/4/24 4:07 PM
 * @Description:
 */
@RefreshScope
@RestController
public class 读取yaml的list {

    /**
     * 方式一，
     * 方式二直接用 @ConfigurationProperties的方式
     */
    @Value("#{'${testList.listStr}'.split(',')}")
    private List<String> list ;

    @GetMapping("/readListByValue")
    public String readListByValue(){
        System.out.println(list);
        return "success";
    }
}
