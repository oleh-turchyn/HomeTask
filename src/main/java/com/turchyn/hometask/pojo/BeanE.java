package com.turchyn.hometask.pojo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE implements BeanValidator {
    private String name;
    private int value;
    private BeanA beanA;

    @Override
    public boolean validate() {
        if(name!=null&&value>0){
            return true;
        }
        else
            return false;
    }
    public BeanE(BeanA beanA) {
        this.beanA=beanA;
    }

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value=" + value +
                " BeanA " + beanA +
                '}';
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("BeanE postConstruct method");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("BeanE preDestroy method");
    }
}
