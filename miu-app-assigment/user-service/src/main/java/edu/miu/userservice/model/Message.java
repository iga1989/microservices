package edu.miu.userservice.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("user-client")
@org.springframework.context.annotation.Configuration
@Data
public class Message {
    private String message;

}
