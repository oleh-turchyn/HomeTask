package com.turchyn.hometask.pojo;

import org.springframework.beans.factory.annotation.Value;

public class BeanC implements BeanValidator {
    @Value("${beanC.name}")
    private String name;
    @Value("${beanC.value}")
    private int value;
    @Override
    public void validate() {

    }

    @Override
    public String toString() {
        return "BeanC{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
