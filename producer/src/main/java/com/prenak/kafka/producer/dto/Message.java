package com.prenak.kafka.producer.dto;

import org.apache.commons.lang3.RandomStringUtils;

import java.time.OffsetDateTime;

public class Message {

    private String id;
    private String name;
    private OffsetDateTime dt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OffsetDateTime getDt() {
        return dt;
    }

    public void setDt(OffsetDateTime dt) {
        this.dt = dt;
    }

    public static Message forUser(String name) {
        var msg = new Message();
        msg.setName(name);
        msg.setId(RandomStringUtils.randomAlphanumeric(5));
        msg.setDt(OffsetDateTime.now());
        return msg;
    }
}
