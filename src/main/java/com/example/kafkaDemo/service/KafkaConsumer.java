package com.example.kafkaDemo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.kafkaDemo.model.Order;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "MyTopic1", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "MyTopic2", groupId = "group_id", 
    		containerFactory = "jsonKafkaListenerContainerFactory")
    public void consumeJson(Order order) {
        System.out.println("Consumed JSON Message: " + order);
    }
}