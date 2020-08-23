package com.turchyn.hometask.configurations;

import com.turchyn.hometask.pojo.beans2.CatAnimal;
import com.turchyn.hometask.pojo.beans2.NarcissusFlower;
import com.turchyn.hometask.pojo.beans3.BeanE;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;


@Configuration
@ComponentScan(basePackages = {"com.turchyn.hometask.pojo.beans2","com.turchyn.hometask.pojo.beans3"},
        excludeFilters =
        {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = {CatAnimal.class,BeanE.class})})
public class AnotherConfiguration {

}
