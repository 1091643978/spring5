package spring.life;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author liubo
 * @date 2020-01-14 17:39
 * @description
 **/
@Configuration
public class CarConfig {

//    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }

}
