package com.example.kafka_consumergroup.consumer;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    private static final Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "newtopic2", groupId = "consumerg-1")
    public void consume1(String message) {
        log.info("Consumer-1 received message = {}", message);
    }

    @KafkaListener(topics = "newtopic2", groupId = "consumerg-1")
    public void consume2(String message) {
        log.info("Consumer-2 received message = {}", message);
    }

    @KafkaListener(topics = "newtopic2", groupId = "consumerg-1")
    public void consume3(String message) {
        log.info("Consumer-3 received message = {}", message);
    }

    @KafkaListener(topics = "newtopic2", groupId = "consumerg-1")
    public void consume4(String message) {
        log.info("Consumer-4 received message = {}", message);
    }

}
