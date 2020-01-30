package spring.ext;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.TxConfig;
import spring.tx.UserService;

import static org.junit.Assert.*;

@Slf4j
public class ExtConfigTest {

    @Test
    public void extTest(){

        AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(ExtConfig.class);
        log.info("Container created...");


        ((AnnotationConfigApplicationContext) factory).close();
    }
}