package com.kiwius.kafka.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 전송할 메시지
 * */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Ping implements Serializable {

    private String name;
    private String msg;
}
