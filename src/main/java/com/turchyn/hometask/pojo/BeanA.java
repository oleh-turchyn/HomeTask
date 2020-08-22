package com.turchyn.hometask.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanA implements BeanValidator, InitializingBean, DisposableBean {
    private String name;
    private int value;
    private BeanValidator b1;
    private BeanValidator b2;

    public BeanA(BeanValidator b1, BeanValidator b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    @Override
    public void validate() {

    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                " Bean1 " + b1 +
                " Bean2 " + b2 +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBeanA method call");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBeanA method call");
    }
}
