package com.turchyn.hometask.configurations;

import com.turchyn.hometask.pojo.*;
import com.turchyn.hometask.pojo.BeanF;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AnotherConfiguration {
    @Bean
    @Lazy
    public BeanF beanF(){
        return new BeanF();
    }
}
