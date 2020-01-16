package spring.life;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liubo
 * @date 2020-01-14 17:39
 * @description
 **/
@ComponentScan({"spring.life"})
@Configuration
public class CarConfig {

    //    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }

    @Bean
    public MyInitailizing myInitailizing() {
        return new MyInitailizing();
    }

    @Bean
    public Truck truck() {
        return new Truck();
    }


    @Bean
    public Dog dog() {
        return new Dog();
    }
}

