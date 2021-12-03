package com.starterstudy.starter.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: 姚飞虎
 * @Date: 2021/12/3 5:52 下午
 * @Description:
 */
@Configuration
public class ThreadPoolAutoConfiguration {

    @Bean
    public ThreadPoolExecutor MyThreadPool() {
        return new ThreadPoolExecutor(
                4,
                20,
                5,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue(100),
                new MyThreadFactory()
        );
    }

    @Data
    @AllArgsConstructor
    public static class MyThreadFactory implements ThreadFactory {

        /**
         * 原子操作保证每个线程都有唯一的
         */
        private static final AtomicInteger threadNumber = new AtomicInteger(1);

        private String name;


        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, name);
        }

        public MyThreadFactory() {
            name = "my-thread-" + threadNumber.getAndIncrement();
        }
    }

}
