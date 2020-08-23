//package com.turchyn.hometask;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
//import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
//
//public class BeanFactoryRealization implements BeanFactoryPostProcessor {
//    @Override
//    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
////        GenericBeanDefinition bd = new GenericBeanDefinition();
////        bd.setBeanClass(BeanB.class);
////        bd.setInitMethodName("newInitMethod");
////        bd.setDestroyMethodName("newDestroyMethod");
////        ((DefaultListableBeanFactory)beanFactory).registerBeanDefinition("beanB",bd);
//        for (String beanName : beanFactory.getBeanDefinitionNames()) {
//            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
//// Manipulate the beanDefiniton or whatever you need to do
//            System.out.println(beanDefinition);
//        }
//    }
//
//}
