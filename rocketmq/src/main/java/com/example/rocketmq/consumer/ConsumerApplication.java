package com.example.rocketmq.consumer;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

/**
 * @author yuebuqun
 * @date 2021/7/30 6:56 下午
 */
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Service
    @RocketMQMessageListener(topic = "test-topic-1", consumerGroup = "my-consumer-topic-1")
    public class MyConsumer implements RocketMQListener<String> {

        @Override
        public void onMessage(String message) {
            System.out.println("received message:" + message);
        }
    }


}
