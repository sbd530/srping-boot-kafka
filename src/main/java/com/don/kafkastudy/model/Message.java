package com.don.kafkastudy.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Message implements Serializable {

    private String author;
    private String content;
    private String timestamp;
}
