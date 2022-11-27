package com.example.rabbitmqconsumer1.service;

public interface HelloConsumer {
    void bindToHelloQueue(String payload);
}
