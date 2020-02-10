package com.pingan.accountinfodecodeapi.processor;

import com.pingan.accountinfodecodeapi.interceptor.HttpInterceptor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

public class MyBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof RestTemplate){
            ((RestTemplate) bean).setInterceptors(Collections.singletonList(new HttpInterceptor()));
        }
        return bean;
    }
}
