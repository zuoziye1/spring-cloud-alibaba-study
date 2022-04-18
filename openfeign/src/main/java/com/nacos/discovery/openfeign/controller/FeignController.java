package com.nacos.discovery.openfeign.controller;

import com.nacos.discovery.server.api.HelloFeignApi;
import com.nacos.discovery.server.model.Person;
import com.nacos.discovery.server.model.PersonParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 姚飞虎
 * @Date: 2021/12/3 11:38 上午
 * @Description:
 */
@RestController
public class FeignController {

    @Autowired
    HelloFeignApi helloFeignApi;

    @PostMapping("/getPerson")
    public Person getPerson(@RequestBody PersonParam personParam) {
        Person person = helloFeignApi.getPerson(personParam);
        return person;
    }
}
