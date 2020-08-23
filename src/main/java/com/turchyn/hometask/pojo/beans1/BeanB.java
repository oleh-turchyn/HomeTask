package com.turchyn.hometask.pojo.beans1;

import com.turchyn.hometask.pojo.anotherbeans.OtherBeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    @Qualifier("otherBeanB")
    private OtherBeanB otherBeanB;

    @Autowired
    public void setOtherBeanB(OtherBeanB otherBeanB) {
        this.otherBeanB = otherBeanB;
    }

    @Override
    public String toString() {
        return "BeanB{" +
                "otherBeanB=" + otherBeanB +
                '}';
    }
}
