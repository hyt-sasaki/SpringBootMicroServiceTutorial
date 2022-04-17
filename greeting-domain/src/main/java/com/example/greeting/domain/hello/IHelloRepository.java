package com.example.greeting.domain.hello;

import java.util.Optional;

public interface IHelloRepository {
    Optional<HelloEntity> findOneById(Long id);
}
