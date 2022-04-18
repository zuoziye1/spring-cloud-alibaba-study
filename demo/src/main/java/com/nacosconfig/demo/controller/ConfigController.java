package com.nacosconfig.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用nacos 做配置中心使用： https://leehao.me/Spring-Cloud-%E4%BD%BF%E7%94%A8-Nacos-%E4%BD%9C%E9%85%8D%E7%BD%AE%E4%B8%AD%E5%BF%83/
 * 读取属性的两种方式：https://blog.csdn.net/aabbcczlk/article/details/107365470
 *
 * @Author: 姚飞虎
 * @Date: 2021/12/2 10:52 上午
 * @Description:
 */
@RefreshScope
@RestController
public class ConfigController {
    private static final Logger logger = LoggerFactory.getLogger(ConfigController.class);

    @Value("${userName:leo}")
    private String user;

    @RequestMapping(value = "/config", method = RequestMethod.GET)
    public String index() {
        logger.info("get user config value from nacos: {}", user);
        return user;
    }

    @Value("${yaofeihu}")
    private String name;


    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public String name() {
        logger.info("get user config value from name: {}", name);
        return name;
    }

    @Value("${test}")
    private String test;


    @RequestMapping(value = "/testN", method = RequestMethod.GET)
    public String test() {
        logger.info("get user config value from test: {}", test);
        return test;
    }

}
