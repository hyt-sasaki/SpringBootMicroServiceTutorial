package com.example.greeting.domain.hello;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class HelloEntity {
    private String message;

    public static HelloEntity create(String message) {
        return new HelloEntity(message);
    }
}
