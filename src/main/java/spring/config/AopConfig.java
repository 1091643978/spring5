package spring.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import spring.aop.LogAspect;
import spring.aop.MathCalculator;

/**
 * @author liubo
 * @date 2020-01-16 17:01
 * @description
 **/
@Slf4j
@EnableAspectJAutoProxy
@Configuration
public class AopConfig {


    @Bean
    public MathCalculator mathCalculator() {
        return new MathCalculator();
    }

    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }
}
