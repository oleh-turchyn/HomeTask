package com.turchyn.hometask.configurations;

import com.turchyn.hometask.pojo.*;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.turchyn.hometask")
@PropertySource("classpath:pojo.properties")
@Import({AnotherConfiguration.class})
public class MyConfiguaration {
    @Bean
    public BeanB beanB(){
        return new BeanB();
    }
    @Bean
    public BeanC beanC(){
        return new BeanC();
    }
    @Bean
    public BeanD beanD(){
        return new BeanD();
    }

    @Bean
    public BeanA beanA1(){
        return new BeanA(beanB(),beanC());
    }
    @Bean
    public BeanA beanA2(){
        return new BeanA(beanB(),beanD());
    }
    @Bean
    public BeanA beanA3(){
        return new BeanA(beanC(),beanD());
    }

}
