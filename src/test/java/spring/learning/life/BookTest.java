package spring.learning.life;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.AutoConfig;
import spring.dao.BookDao;
import spring.life.Boss;
import spring.life.Car;
import spring.life.Rich;
import spring.service.BookService;

/**
 * @author liubo
 * @date 2020-01-14 17:39
 * @description
 **/
@Slf4j
public class BookTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        System.out.println("container created...");

        BookService h = context.getBean(BookService.class);

        BookDao dao = context.getBean(BookDao.class);
        log.info("===>{}", h);
        h.print();

        log.info("===> equals:{}", dao);
        context.close();
    }

    @Test
    public void autoWireTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        System.out.println("container created...");

        Boss b = context.getBean(Boss.class);
        Car c = context.getBean(Car.class);
        Rich r = context.getBean(Rich.class);

        log.info("b={}",b);
        log.info("c={}",c);
        log.info("r={}",r);


        context.close();
    }


}
