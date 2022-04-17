package com.example.greeting.usecase.hello;

import com.example.greeting.domain.hello.HelloEntity;
import com.example.greeting.domain.hello.IHelloRepository;
import com.example.greeting.usecase.GreetingUsecaseBeanConfig;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = GreetingUsecaseBeanConfig.class)
class HelloServiceTest {
    @Autowired
    IHelloService helloService;
    @MockBean
    IHelloRepository helloRepository;

    @Test
    void fetchMessage() {
        // given
        val expectedMessage = "hello from HelloService";
        when(helloRepository.findOneById(1L))
                .thenReturn(Optional.of(HelloEntity.fromRepository(1L, expectedMessage)));
        // when
        val helloDto = helloService.fetchMessage();
        // then
        assertThat(helloDto.getMessage()).isEqualTo(expectedMessage);
    }
}