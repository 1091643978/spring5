package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.dao.BookDao;

/**
 * @author liubo
 * @date 2020-01-16 10:04
 * @description 自动装配置
 * 1.autowire
 **/
@ComponentScan({"spring.service", "spring.dao"})
@Configuration
public class AutoConfig {

    @Bean("bookDao2")
    public BookDao bookDao() {
         BookDao b =  new BookDao();
         b.setLabel("2");

         return b;
    }
}
