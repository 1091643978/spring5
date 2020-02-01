package spring.listener;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liubo
 * @date 2020-01-17 17:27
 * <p>
 * BeanPostProcessor
 * <p>
 * BeanFactoryPostProcessor
 **/
@ComponentScan("spring.listener")
@Configuration
public class ListenerConfig {

    @Bean
    public Apple apple() {
        Apple a = new Apple();
        a.setName("红富士");

        return a;
    }

}
