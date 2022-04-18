package com.nacos.discovery.server.controller;

import com.nacos.discovery.server.model.Person;
import com.nacos.discovery.server.model.PersonParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 姚飞虎
 * @Date: 2021/12/3 11:47 上午
 * @Description:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name) {
        return "hello," + name;
    }

    @RequestMapping(value = "/getPerson", method = RequestMethod.POST)
    public Person getPerson(@RequestBody PersonParam personParam) {
        System.out.println(personParam);
        Person person = new Person();
        person.setId(18L);
        person.setName("jordan");
        return person;
    }

}
