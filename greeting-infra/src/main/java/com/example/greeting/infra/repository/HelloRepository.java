package com.example.greeting.infra.repository;

import com.example.greeting.domain.hello.HelloEntity;
import com.example.greeting.domain.hello.IHelloRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.example.generated.jooq.sample.Tables.GREETINGS;

@Repository
@RequiredArgsConstructor
public class HelloRepository implements IHelloRepository {
    @NonNull
    private final DSLContext jooq;

    @Override
    public Optional<HelloEntity> findOneById(Long id) {
        return jooq.selectFrom(GREETINGS)
                .where(GREETINGS.ID.eq(id))
                .fetchOptional()
                .map(r -> HelloEntity.fromRepository(r.getId(), r.getMessage()));
    }
}
