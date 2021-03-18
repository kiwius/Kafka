package com.kiwius.kafka.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * return 메시지
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Pong implements Serializable {
    private String name;
    private String msg;
}
