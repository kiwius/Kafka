package com.kiwius.kafka.domain;

import lombok.*;

import java.io.Serializable;

/**
 * return 메시지
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Pong implements Serializable {
    private String name;
    private String msg;
}
