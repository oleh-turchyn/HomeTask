package com.turchyn.hometask.pojo;

public class BeanE implements BeanValidator {
    private String name;
    private int value;
    private BeanA beanA;

    @Override
    public void validate() {

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
}
