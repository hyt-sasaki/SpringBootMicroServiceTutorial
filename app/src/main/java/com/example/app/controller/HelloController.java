package com.example.app.controller;

import com.example.app.generated.api.HelloApi;
import com.example.app.generated.model.HelloDTO;
import com.example.greeting.usecase.hello.IHelloService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class HelloController implements HelloApi {
    @NonNull
    private final IHelloService helloService;

    @Override
    public ResponseEntity<HelloDTO> v1HelloGet() {
        return ResponseEntity.ok(convertDto(helloService.fetchMessage()));
    }

    private HelloDTO convertDto(com.example.greeting.usecase.hello.HelloDTO dto) {
        return new HelloDTO().message(dto.getMessage());
    }
}
