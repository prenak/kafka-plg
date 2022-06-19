package com.prenak.kafka.consumer.listener;

import com.prenak.kafka.consumer.config.KafkaConsumerConfig;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = KafkaConsumerConfig.TEST_TOPIC, groupId = "test_group_1")
    public void onMessageReceived(String message) {
        System.out.println("Received: " + message);
    }
}
