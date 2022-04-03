package com.example.app.controller;

import com.example.app.config.AppConfig;
import com.example.greeting.usecase.hello.HelloDTO;
import com.example.greeting.usecase.hello.IHelloService;
import lombok.SneakyThrows;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
@ContextConfiguration(classes = {AppConfig.class})
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private IHelloService helloService;

    @SneakyThrows
    @Test
    void v1HelloGet() {
        // given
        when(helloService.fetchMessage())
                .thenReturn(HelloDTO.builder()
                        .message("hello").build());
        // when
        val resultActions = mockMvc.perform(get("/v1/hello"));
        // then
        resultActions
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.message").value("hello"));
    }
}