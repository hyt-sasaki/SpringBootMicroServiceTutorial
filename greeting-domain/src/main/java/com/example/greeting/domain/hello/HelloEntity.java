package com.example.greeting.domain.hello;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class HelloEntity {
    private Long id;
    @NonNull
    private String message;

    public static HelloEntity create(@NonNull String message) {
        return new HelloEntity(null, message);
    }

    public static HelloEntity fromRepository(@NonNull Long id, @NonNull String message) {
        return new HelloEntity(id, message);
    }
}
