package com.example.rabbitmqpublisher.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQFanoutConfig {

    @Bean
    Queue marketingQueueFanout() {
        return new Queue("marketingQueueFanout", false);
    }

    @Bean
    Queue financeQueueFanout() {
        return new Queue("financeQueueFanout", false);
    }

    @Bean
    Queue adminQueueFanout() {
        return new Queue("adminQueueFanout", false);
    }

    @Bean
    FanoutExchange exchangeFanOut() {
        return new FanoutExchange("fanout-exchange");
    }

    @Bean
    Binding marketingBindingFanout(Queue marketingQueue, FanoutExchange exchange) {
        return BindingBuilder.bind(marketingQueue).to(exchange);
    }

    @Bean
    Binding financeBindingFanout(Queue financeQueue, FanoutExchange exchange) {
        return BindingBuilder.bind(financeQueue).to(exchange);
    }

    @Bean
    Binding adminBindingFanout(Queue adminQueue, FanoutExchange exchange) {
        return BindingBuilder.bind(adminQueue).to(exchange);
    }

}
