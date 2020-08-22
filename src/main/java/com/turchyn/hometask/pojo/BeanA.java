package com.turchyn.hometask.pojo;

public class BeanA implements BeanValidator {
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
                " Bean1" + b1 +
                " Bean2" + b2 +
                '}';
    }
}
