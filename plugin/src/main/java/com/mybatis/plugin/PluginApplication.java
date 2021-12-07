package com.mybatis.plugin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybatis.plugin.generator.mapper")
public class PluginApplication {

    public static void main(String[] args) {
        SpringApplication.run(PluginApplication.class, args);
    }

}
