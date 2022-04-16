package com.example.greeting.infra.repository;

import com.example.greeting.domain.hello.HelloEntity;
import com.example.greeting.domain.hello.IHelloRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static com.example.generated.jooq.sample.Tables.GREETINGS;

@Repository
@RequiredArgsConstructor
public class HelloRepository implements IHelloRepository {
    @NonNull
    private final DSLContext jooq;

    @Override
    public HelloEntity fetch() {
        val message = jooq.select(GREETINGS.MESSAGE)
                .from(GREETINGS)
                .where(GREETINGS.ID.eq(1L))
                .fetchOptional(GREETINGS.MESSAGE)
                .orElse("mocked message");
        return HelloEntity.create(message + " at " + OffsetDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
