package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import spring.dao.BookDao;
import spring.life.Car;
import spring.life.Rich;

/**
 * @author liubo
 * @date 2020-01-16 10:04
 * @description 自动装配置
 * 1.autowire
 **/
@ComponentScan({"spring.service", "spring.dao", "spring.life"})
@Configuration
public class AutoConfig {

    @Primary
    @Bean("bookDao2")
    public BookDao bookDao() {
        BookDao b = new BookDao();
        b.setLabel("2");

        return b;
    }

//    @Bean
//    public Rich rich(@Autowired Car car) {
//        Rich r = new Rich();
//        r.setCar(car);
//        return r;
//    }

    @Bean
    public Rich rich(Car car) {
        Rich r = new Rich();
        r.setCar(car);
        return r;
    }


}
