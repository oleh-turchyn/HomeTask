package com.turchyn.hometask.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class AnotherTestBean {
    private MyInterface item1;
    private MyInterface item2;
    private MyInterface item3;

    @Autowired
    public AnotherTestBean(MyInterface item1, @Qualifier("beanZ") MyInterface item2, @Qualifier("beanY") MyInterface item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    @Override
    public String toString() {
        return "AnotherTestBean{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                ", item3=" + item3 +
                '}';
    }
}
