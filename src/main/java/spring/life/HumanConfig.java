package spring.life;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import spring.learning.domain.Human;

/**
 * @author liubo
 * @date 2020-01-16 09:38
 * @description
 **/
//@Import({Human.class})
@PropertySource(value = {"classpath:/human.properties"})
@Configuration
public class HumanConfig {

    @Bean
    public Human human(){
        return new Human();
    }
}
