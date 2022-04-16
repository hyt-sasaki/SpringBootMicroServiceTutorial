package com.example.greeting.infra.repository;

import com.example.greeting.domain.hello.HelloEntity;
import com.example.greeting.domain.hello.IHelloRepository;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

@Repository
public class HelloRepository implements IHelloRepository {
    @Override
    public HelloEntity fetch() {
        return HelloEntity.create("mocked message at " + OffsetDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
