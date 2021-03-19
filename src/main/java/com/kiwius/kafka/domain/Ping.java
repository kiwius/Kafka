package com.kiwius.kafka.domain;

import lombok.*;

import java.io.Serializable;

/**
 * 전송할 메시지
 * */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Ping implements Serializable {

    private String name;
    private String msg;
}
