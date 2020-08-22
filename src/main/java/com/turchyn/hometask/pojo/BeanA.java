package com.turchyn.hometask.pojo;

public class BeanA implements BeanValidator {
    private String name;
    private int value;

    @Override
    public void validate() {

    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
