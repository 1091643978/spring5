package spring.ext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.life.Dog;

/**
 * @author liubo
 * @date 2020-01-17 17:27
 *
 * BeanPostProcessor
 *
 * BeanFactoryPostProcessor
 *
 *
 **/
@ComponentScan("spring.ext")
@Configuration
public class ExtConfig {

    @Bean
    public Dog dog(){
        return new Dog();
    }
}
