package com.example.app.config;

import com.example.greeting.infra.config.GreetingInfraBeanConfig;
import com.example.greeting.usecase.GreetingUsecaseBeanConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.example.app")
@Import({GreetingUsecaseBeanConfig.class, GreetingInfraBeanConfig.class})
public class AppConfig {
}
