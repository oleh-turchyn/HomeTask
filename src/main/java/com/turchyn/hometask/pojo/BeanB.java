package com.turchyn.hometask.pojo;

import org.springframework.beans.factory.annotation.Value;

public class BeanB implements BeanValidator {
    @Value("${beanB.name}")
    private String name;
    @Value("${beanB.value}")
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
    public void newInitMethod(){
        System.out.println("new init method for beanB");
    }
    public void myDestroy(){
        System.out.println("My destroy method");
    }
    public void newDestroyMethod(){
        System.out.println("new destroy method for beanB");
    }
    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
