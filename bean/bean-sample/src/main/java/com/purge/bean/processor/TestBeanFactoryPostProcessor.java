package com.purge.bean.processor;

import com.purge.demo.entity.Company;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * Bean工厂的后置处理器
 *
 * @author purgeyao
 * @since 1.0
 */
@Slf4j
@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        GenericBeanDefinition beanDefinition = getGenericBeanDefinition();

        ((DefaultListableBeanFactory) beanFactory).registerBeanDefinition("company", beanDefinition);

        log.info("[BeanFactoryPostProcessor] 注册bean");
    }

    private GenericBeanDefinition getGenericBeanDefinition() {
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(Company.class);
        beanDefinition.getPropertyValues().add("name", "阿里");
        beanDefinition.getPropertyValues().add("employeesNum", 10000);
        return beanDefinition;
    }
}
