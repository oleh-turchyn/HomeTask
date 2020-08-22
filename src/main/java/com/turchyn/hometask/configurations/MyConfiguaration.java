package com.turchyn.hometask.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.turchyn.hometask")
@Import({AnotherConfiguration.class})
public class MyConfiguaration {
}
