package com.turchyn.hometask.pojo;

import org.springframework.beans.factory.annotation.Value;

public class BeanD  implements BeanValidator {
    @Value("${beanD.name}")
    private String name;
    @Value("${beanD.value}")
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
        return "BeanD{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
