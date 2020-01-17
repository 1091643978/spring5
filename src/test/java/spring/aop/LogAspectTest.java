package spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.AopConfig;

@Slf4j
public class LogAspectTest {

    @Test
    public void aopTest() {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AopConfig.class);
        log.info("Container created...");

        MathCalculator mc = factory.getBean(MathCalculator.class);

        mc.divide(1, 0);



    }
}