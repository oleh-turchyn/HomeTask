package com.turchyn.hometask.pojo.beans1;

import com.turchyn.hometask.pojo.anotherbeans.OtherBeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private OtherBeanA otherBeanA;

    @Autowired
    public BeanA(OtherBeanA otherBeanA) {
        this.otherBeanA = otherBeanA;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "otherBeanA=" + otherBeanA +
                '}';
    }
}
