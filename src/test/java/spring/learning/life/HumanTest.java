package spring.learning.life;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.learning.domain.Human;
import spring.life.HumanConfig;

/**
 * @author liubo
 * @date 2020-01-14 17:39
 * @description
 **/
@Slf4j
public class HumanTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HumanConfig.class);
        System.out.println("container created...");

        Human h = (Human) context.getBean("human");

        log.info("===>{}", h);

        log.info("===>2.nickName={}", context.getEnvironment().getProperty("human.nickName"));
        context.close();
    }

}
