package com.example.greeting.infra.repository;

import com.example.greeting.domain.hello.HelloEntity;
import com.example.greeting.domain.hello.IHelloRepository;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository implements IHelloRepository {
    @Override
    public HelloEntity fetch() {
        return HelloEntity.create("mocked message");
    }
}
