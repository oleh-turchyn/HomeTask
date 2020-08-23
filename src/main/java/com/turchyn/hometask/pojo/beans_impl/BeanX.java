package com.turchyn.hometask.pojo.beans_impl;

import com.turchyn.hometask.pojo.MyInterface;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
@Primary
public class BeanX implements MyInterface {
    @Override
    public String myMethod() {
        return "This is BeanX";
    }
}
