package com.nacos.discovery.openfeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: 姚飞虎
 * @Date: 2021/12/3 11:41 上午
 * @Description:
 */
@FeignClient("server")
public interface NameService {

    /**
     * 绑定接口
     * 1.这里的接口url需要和服务方一致
     * 2.参数需要和服务端的对应起来，并需要指定注解
     * 否则会报 405：https://blog.csdn.net/weixin_44411398/article/details/113759917
     * @param name
     * @return
     */
    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);
}
