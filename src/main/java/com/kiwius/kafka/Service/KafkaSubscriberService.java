package com.kiwius.kafka.Service;

import com.kiwius.kafka.domain.Ping;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
public class KafkaSubscriberService {

    @KafkaListener(topics = "${ping.topic.name}", containerFactory = "pingKafkaListenerContainerFactory")
    public void pingListener(Ping ping, Acknowledgment ack) {
        try {
            System.out.println("Received ping message : " + ping);
            ack.acknowledge();
        } catch (Exception e) {
            String msg = "시스템에 문제가 발생했습니다.";
            System.out.println("Received ping message : " + msg + e);
        }
    }
}
