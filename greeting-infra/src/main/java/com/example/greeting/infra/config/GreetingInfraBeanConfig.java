package com.example.greeting.infra.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.example.greeting.infra")
public class GreetingInfraBeanConfig {

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();

        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://127.0.0.1:13306/sample");
        config.setUsername("docker");
        config.setPassword("docker");

        return new HikariDataSource(config);
    }

    @Bean
    public DSLContext dlsContext() {
        return new DefaultDSLContext(dataSource(), SQLDialect.MYSQL);
    }
}
