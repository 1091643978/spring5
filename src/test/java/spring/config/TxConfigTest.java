package spring.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.tx.UserService;

@Slf4j
public class TxConfigTest {

    @Test
    public void dataSource() {

        AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(TxConfig.class);
        log.info("Container created...");

        UserService us = factory.getBean(UserService.class);

        us.insertUser();


        ((AnnotationConfigApplicationContext) factory).close();
    }
}