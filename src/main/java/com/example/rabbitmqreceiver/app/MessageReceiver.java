package com.example.rabbitmqreceiver.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class MessageReceiver {
    @Bean
    Consumer<Message> receiveMessage() {
        return message -> System.out.println(message.getText());
    }
}
