package com.kiwius.kafka.Service;

import com.kiwius.kafka.domain.Ping;
import com.kiwius.kafka.domain.Pong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class PingService {
    @Autowired
    private KafkaTemplate<String, Ping> pingKafkaTemplate;

    @Value(value = "${ping.topic.name}")
    private String pingTopicName;

    public Pong pingAndPong(Ping ping) throws Exception {

    }
}
