package com.mybatis.plugin.controller;

import com.mybatis.plugin.generator.model.ProductA;
import com.mybatis.plugin.service.IProductAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 姚飞虎
 * @Date: 2021/12/7 12:51 下午
 * @Description:
 */
@RestController
public class ProductController {

    @Autowired
    private IProductAService productAService;

    @RequestMapping("/ProductA")
    public ProductA getUser() {
        return productAService.getById(1);
    }
}
