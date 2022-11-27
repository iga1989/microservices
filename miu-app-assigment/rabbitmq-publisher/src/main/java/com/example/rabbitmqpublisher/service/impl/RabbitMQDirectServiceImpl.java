package com.example.rabbitmqpublisher.service.impl;

import com.example.rabbitmqpublisher.service.RabbitMQDirectService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitMQDirectServiceImpl implements RabbitMQDirectService {
    private final RabbitTemplate rabbitTemplate;
    private final Queue marketingQueue;
    private final Queue financeQueue;
    private final Queue adminQueue;

    /*@Override
    public void send() {
        rabbitTemplate.convertAndSend(this.marketingQueue.getName(), "Marketing -- Hello World: " + System.currentTimeMillis());
        rabbitTemplate.convertAndSend(this.financeQueue.getName(), "Finance -- Hello World: " + System.currentTimeMillis());
        rabbitTemplate.convertAndSend(this.adminQueue.getName(), "Admin -- Hello World: " + System.currentTimeMillis());
    }*/
}
