package com.example.rabbitmqconsumer2.service.impl;

import com.example.rabbitmqconsumer2.service.HelloConsumer;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class HelloConsumerImpl implements HelloConsumer {

    @Override
    //@RabbitListener(queues = {"hello-queue-2"})
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "hello-queue-2", durable = "true"),
            exchange = @Exchange(name = "hello-fanout-exchange", type = "fanout")
    ))
    public void bindToHelloQueue(String payload) {
        System.out.println(payload);
    }
}
