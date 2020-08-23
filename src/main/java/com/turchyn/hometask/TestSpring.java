package com.turchyn.hometask;

import com.turchyn.hometask.configurations.AnotherConfiguration;
import com.turchyn.hometask.configurations.MyConfiguaration;
import com.turchyn.hometask.pojo.*;
import com.turchyn.hometask.pojo.anotherbeans.*;
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

        TestBean testBean = context.getBean("testBean",TestBean.class);
        testBean.myMethod();
        AnotherTestBean anotherTestBean = context.getBean("anotherTestBean",AnotherTestBean.class);
        System.out.println(anotherTestBean);

        System.out.println("testing scopes");
        OtherBeanA otherBeanA1 = context.getBean("otherBeanA",OtherBeanA.class);
        OtherBeanA otherBeanA2 = context.getBean("otherBeanA",OtherBeanA.class);
        OtherBeanB otherBeanB = context.getBean("otherBeanB",OtherBeanB.class);
        OtherBeanC otherBeanC1 = context.getBean("otherBeanC",OtherBeanC.class);
        OtherBeanC otherBeanC2 = context.getBean("otherBeanC",OtherBeanC.class);

        System.out.println(otherBeanA1);
        System.out.println(otherBeanA2);
        System.out.println(otherBeanB);
        System.out.println(otherBeanC1);
        System.out.println(otherBeanC2);

        context.close();
    }
}
