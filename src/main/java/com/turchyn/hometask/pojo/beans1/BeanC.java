package com.turchyn.hometask.pojo.beans1;

import com.turchyn.hometask.pojo.anotherbeans.OtherBeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanC {
    @Autowired
    private OtherBeanC otherBeanC;

    @Override
    public String toString() {
        return "BeanC{" +
                "otherBeanC=" + otherBeanC +
                '}';
    }
}
