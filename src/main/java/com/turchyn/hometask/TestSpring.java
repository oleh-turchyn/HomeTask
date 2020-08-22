package com.turchyn.hometask;

import com.turchyn.hometask.configurations.MyConfiguaration;
import com.turchyn.hometask.pojo.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguaration.class);
//        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        Arrays.asList(context.getBeanDefinitionNames()).stream().sorted().forEach(System.out::println);
        BeanA beanA1 = context.getBean("beanA1", BeanA.class);
        BeanA beanA2 = context.getBean("beanA2", BeanA.class);
        BeanA beanA3 = context.getBean("beanA3", BeanA.class);
        System.out.println(beanA1);
        System.out.println(beanA2);
        System.out.println(beanA3);
        context.close();
    }
}
