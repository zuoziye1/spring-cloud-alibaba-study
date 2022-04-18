package com.nacos.discovery.server.api;

import com.nacos.discovery.server.model.Person;
import com.nacos.discovery.server.model.PersonParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: 姚飞虎
 * @Date: 2022/1/20 2:14 下午
 * @Description:
 */
@FeignClient(value = "${spring.application.name}")
public interface HelloFeignApi {

    /**
     * getPerson
     *
     * @param personParam
     * @return
     */
    @PostMapping("getPerson")
    Person getPerson(@RequestBody PersonParam personParam);

}
