package com.turchyn.hometask;

import com.turchyn.hometask.configurations.AnotherConfiguration;
import com.turchyn.hometask.configurations.MyConfiguaration;
import com.turchyn.hometask.pojo.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnotherConfiguration.class);
        Arrays.asList(context.getBeanDefinitionNames()).stream().forEach(System.out::println);

        context.close();
    }
}
