package com.turchyn.hometask;

import com.turchyn.hometask.configurations.MyConfiguaration;
import com.turchyn.hometask.pojo.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguaration.class);
//        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        Arrays.asList(context.getBeanDefinitionNames()).stream().forEach(System.out::println);
//        BeanA beanA1 = context.getBean("beanA1", BeanA.class);
//        BeanA beanA2 = context.getBean("beanA2", BeanA.class);
//        BeanA beanA3 = context.getBean("beanA3", BeanA.class);
//        System.out.println(beanA1);
//        System.out.println(beanA2);
//        System.out.println(beanA3);
//        BeanE beanE1 = context.getBean("beanE1", BeanE.class);
//        BeanE beanE2 = context.getBean("beanE2", BeanE.class);
//        BeanE beanE3 = context.getBean("beanE3", BeanE.class);
//        System.out.println(beanE1);
//        System.out.println(beanE2);
//        System.out.println(beanE3);
        context.close();
    }
}
