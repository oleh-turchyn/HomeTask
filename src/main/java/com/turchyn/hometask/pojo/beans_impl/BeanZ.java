package com.turchyn.hometask.pojo.beans_impl;

import com.turchyn.hometask.pojo.MyInterface;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class BeanZ implements MyInterface {
    @Override
    public String myMethod() {
        return "This is BeanZ";
    }
}
