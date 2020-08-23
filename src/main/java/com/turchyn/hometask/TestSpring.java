package com.turchyn.hometask;

import com.turchyn.hometask.configurations.AnotherConfiguration;
import com.turchyn.hometask.configurations.MyConfiguaration;
import com.turchyn.hometask.pojo.*;
import com.turchyn.hometask.pojo.beans1.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguaration.class);
        Arrays.asList(context.getBeanDefinitionNames()).stream().forEach(System.out::println);
        BeanA beanA = context.getBean("beanA", BeanA.class);
        BeanB beanB = context.getBean("beanB", BeanB.class);
        BeanC beanC =context.getBean("beanC", BeanC.class);
        System.out.println(beanA);
        System.out.println(beanB);
        System.out.println(beanC);
        context.close();
    }
}
