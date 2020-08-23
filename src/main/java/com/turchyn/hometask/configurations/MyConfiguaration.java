package com.turchyn.hometask.configurations;

import com.turchyn.hometask.pojo.beans1.BeanA;
import com.turchyn.hometask.pojo.beans1.BeanB;
import com.turchyn.hometask.pojo.beans1.BeanC;
import com.turchyn.hometask.pojo.beans3.BeanD;
import com.turchyn.hometask.pojo.beans3.BeanE;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan("com.turchyn.hometask")
@PropertySource("classpath:pojo.properties")
@Import({AnotherConfiguration.class})
public class MyConfiguaration {

}
