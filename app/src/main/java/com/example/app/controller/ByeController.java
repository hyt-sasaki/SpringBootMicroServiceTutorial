package com.example.app.controller;

import com.example.app.generated.api.ByeApi;
import com.example.app.generated.model.ByeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class ByeController implements ByeApi {
    @Override
    public ResponseEntity<ByeDTO> v1ByeGet() {
        return ResponseEntity.ok(new ByeDTO().message("bye"));
    }
}
