package com.turchyn.hometask.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestBean {
    private List<MyInterface> myList;

    @Autowired
    public TestBean(List<MyInterface> myList) {
        this.myList = myList;
    }

    public void myMethod() {
        System.out.println("all messages from beans: ");
        for (MyInterface item : myList) {
            System.out.println("message " + item.myMethod());
        }
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "myList=" + myList +
                '}';
    }
}
