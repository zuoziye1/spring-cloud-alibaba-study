package com.nacosconfig.demo.controller;

import com.nacosconfig.demo.model.EnumReq;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试springboot 接受枚举参数，和探究springboot是如何实现的
 * 参考：https://blog.csdn.net/liuxinghao/article/details/119725983
 * @Author: 姚飞虎
 * @Date: 2022/4/18 7:08 PM
 * @Description:
 */
@RestController
public class EnumReqController {

    /**
     * 入参可以使用枚举，但出参不适用枚举
     * 原因：https://blog.csdn.net/alinyua/article/details/86383254
     * @param enumReq
     * @return
     */
    @RequestMapping("/testEnumReq")
    public String testEnumReq(@RequestBody EnumReq enumReq){
        System.out.println(enumReq);
        return "success";
    }

}
