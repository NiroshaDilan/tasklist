package com.csi.ehr.opd.nurse.tasklist.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @Project task-list
 * @Author DILAN on 6/3/2018
 */
@Service
public class BeanUtil implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public static<T> T getBean(Class<T> beanClass) {
        return context.getBean(beanClass);
    }
}
