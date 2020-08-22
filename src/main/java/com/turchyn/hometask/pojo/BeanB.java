package com.turchyn.hometask.pojo;

public class BeanB implements BeanValidator {
    private String name;
    private int value;
    @Override
    public void validate() {

    }

    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
