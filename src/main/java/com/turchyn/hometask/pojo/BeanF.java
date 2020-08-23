package com.turchyn.hometask.pojo;

public class BeanF implements BeanValidator {
    private String name;
    private int value;
    @Override
    public boolean validate() {
        if(name!=null&&value>0){
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "BeanF{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
