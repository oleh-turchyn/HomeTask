package com.turchyn.hometask.pojo;

public class BeanE implements BeanValidator {
    private String name;
    private int value;
    @Override
    public void validate() {

    }

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
