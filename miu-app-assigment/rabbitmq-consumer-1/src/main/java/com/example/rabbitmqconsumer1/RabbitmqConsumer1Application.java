package com.example.rabbitmqconsumer1;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class RabbitmqConsumer1Application {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqConsumer1Application.class, args);
    }

}
