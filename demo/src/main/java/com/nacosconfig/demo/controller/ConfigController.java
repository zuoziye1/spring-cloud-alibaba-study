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
 * @Author: 姚飞虎
 * @Date: 2021/12/2 10:52 上午
 * @Description:
 */
@RefreshScope
@RestController
public class ConfigController {
    private static final Logger logger = LoggerFactory.getLogger(ConfigController.class);

    @Value("${user:leo}")
    private String user;

    @RequestMapping(value = "/config", method = RequestMethod.GET)
    public String index() {
        logger.info("get user config value from nacos: {}", user);
        return user;
    }
}
