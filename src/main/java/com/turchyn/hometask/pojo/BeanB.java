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
    public void myInit(){
        System.out.println("My initialization method");
    }
    public void myDestroy(){
        System.out.println("My destroy method");
    }
    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
