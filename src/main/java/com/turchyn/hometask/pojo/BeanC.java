package com.turchyn.hometask.pojo;

import org.springframework.beans.factory.annotation.Value;

public class BeanC implements BeanValidator {
    @Value("${beanC.name}")
    private String name;
    @Value("${beanC.value}")
    private int value;
    @Override
    public boolean validate() {
        if(name!=null&&value>0){
            return true;
        }
        else
            return false;
    }
    public void myInit(){
        System.out.println("My initialization method");
    }
    public void myDestroy(){
        System.out.println("My destroy method");
    }
    @Override
    public String toString() {
        return "BeanC{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
