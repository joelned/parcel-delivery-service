package com.example.School.Configurations;

import com.example.School.Entities.Orders;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrdersConfig {
    @Bean
    public Orders order(){
        return new Orders();
    }
}
