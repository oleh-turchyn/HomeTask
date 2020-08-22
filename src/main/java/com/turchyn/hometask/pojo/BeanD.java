package com.turchyn.hometask.pojo;

import org.springframework.beans.factory.annotation.Value;

public class BeanD  implements BeanValidator {
    @Value("${beanD.name}")
    private String name;
    @Value("${beanD.value}")
    private int value;
    @Override
    public void validate() {

    }

    @Override
    public String toString() {
        return "BeanD{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
