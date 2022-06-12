package com.prenak.kafka.producer.controller;

import com.prenak.kafka.producer.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka")
public class MessageController {

    private static final String TEST_TOPIC = "test_message";

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    @GetMapping("/publish/{name}")
    @ResponseStatus(HttpStatus.OK)
    public String publishMessage(@PathVariable("name") String name) {
        kafkaTemplate.send(TEST_TOPIC, Message.forUser(name));
        return "published message";
    }
}
