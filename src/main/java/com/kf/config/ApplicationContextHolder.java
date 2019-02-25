package com.kf.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author jianglu email:ansndx@163.com
 */
@Component
public class ApplicationContextHolder implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public static <T> T getBean(Class<T> clazz){
        return context.getBean(clazz);
    }

    public static Object getBeanByName(String name){
        return context.getBean(name);
    }

    public static ApplicationContext getContext() {
        return context;
    }
}
