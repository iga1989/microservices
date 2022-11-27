package com.example.rabbitmqconsumer2.service;

public interface HelloConsumer {
    void bindToHelloQueue(String payload);
}