package com.nacosconfig.demo.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 姚飞虎
 * @Date: 2022/4/13 11:09 AM
 * @Description:
 */
@RestController
public class NacosValueAutoRefreshController {

    /**
     * todo 没有生效
     */
    @NacosValue(value = "${test}",autoRefreshed = true)
    private String test ;

    @RequestMapping("/nacos/testNacosValue")
    public String getTest(){
        return test;
    }

}
