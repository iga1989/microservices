package edu.miu.userservice.controller;

import edu.miu.userservice.model.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RefreshScope
@Configuration
@EnableAutoConfiguration
public class MessageRestController {
    /*public Message message;

    public MessageRestController(Message message) {
        this.message = message;
    }

    @GetMapping("/message")
    public String retrieveLimits(){
        return message.getMessage();
    }*/

    @Value("${user-client.message}")
    public String message = "Renatah";

    @RequestMapping("/message")
    public String home(){
        return this.message;
    }

}
