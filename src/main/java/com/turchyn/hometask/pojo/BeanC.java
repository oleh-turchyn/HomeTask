package com.turchyn.hometask.pojo;

public class BeanC implements BeanValidator {
    private String name;
    private int value;
    @Override
    public void validate() {

    }

    @Override
    public String toString() {
        return "BeanC{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
