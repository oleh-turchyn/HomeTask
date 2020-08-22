package com.turchyn.hometask.pojo;

import org.springframework.beans.factory.annotation.Value;

public class BeanB implements BeanValidator {
    @Value("${beanB.name}")
    private String name;
    @Value("${beanB.value}")
    private int value;
    @Override
    public void validate() {

    }

    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
