package com.nacosconfig.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ThreadPoolExecutor;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private ThreadPoolExecutor myTreadPoolExecutor;

    @Test
    void contextLoads() {
        System.out.println(myTreadPoolExecutor.getMaximumPoolSize());
    }

}
