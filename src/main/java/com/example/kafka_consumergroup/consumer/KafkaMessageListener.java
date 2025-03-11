package com.example.kafka_consumergroup.consumer;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    private static final Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "newtopic2")
    public void consume(String message) {
        log.info("received message = {}", message);
    }

}
