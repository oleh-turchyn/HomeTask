package com.turchyn.hometask.pojo;

public class BeanD  implements BeanValidator {
    private String name;
    private int value;
    @Override
    public void validate() {

    }

    @Override
    public String toString() {
        return "BeanD{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
