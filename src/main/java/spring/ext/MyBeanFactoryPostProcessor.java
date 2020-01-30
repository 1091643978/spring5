package spring.ext;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author liubo
 * @date 2020-01-17 17:57
 * @description
 **/
@Slf4j
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info("---->MyBeanFactoryPostProcessor...posted...");
        int count = beanFactory.getBeanDefinitionCount();

        String[] names = beanFactory.getBeanDefinitionNames();

        log.info("count={}  name={}", count, names);
    }
}
