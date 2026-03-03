package com.testing_first.demo.config;


import org.apache.ibatis.type.TypeHandler;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
@MapperScan("com.testing_first.demo.mapper") // Your mapper package
public class MyBatisConfig {

    // Register the UUIDTypeHandler
    @Bean
    public TypeHandler<UUID> uuidTypeHandler() {
        return new UUIDTypeHandler();
    }
}