package com.example.greeting.usecase.hello;

import com.example.greeting.domain.hello.IHelloRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
class HelloService implements IHelloService {
    @NonNull
    private final IHelloRepository helloRepository;

    @Override
    public HelloDTO fetchMessage(Integer id) {
        val entity = helloRepository.findOneById(Long.valueOf(id))
                .orElseThrow(() -> new RuntimeException("Not Found"));
        return HelloDTO.builder()
                .message(entity.getMessage()).build();
    }
}
