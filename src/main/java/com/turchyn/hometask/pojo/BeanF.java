package com.turchyn.hometask.pojo;

public class BeanF implements BeanValidator {
    private String name;
    private int value;
    @Override
    public void validate() {

    }

    @Override
    public String toString() {
        return "BeanF{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
