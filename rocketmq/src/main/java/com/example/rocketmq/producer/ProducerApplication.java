package com.example.rocketmq.producer;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

/**
 * @author yuebuqun
 * @date 2021/7/30 6:51 下午
 */
@SpringBootApplication
public class ProducerApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

    @Resource
    RocketMQTemplate rocketMQTemplate;

    @Override
    public void run(String... args) throws Exception {
        rocketMQTemplate.convertAndSend("test-topic-1", "hello  world");
    }
}
