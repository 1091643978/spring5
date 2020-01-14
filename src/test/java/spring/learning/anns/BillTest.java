package spring.learning.anns;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import spring.anns.MyConfig;
import spring.anns.Student;

import java.util.Arrays;

/**
 * @author liubo
 * @date 2020-01-13 20:38
 * @description
 **/
public class BillTest {

    @Test
    public void bill(){

        ApplicationContext beanFactory = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("============");
        System.out.println( beanFactory.getBeansOfType(Student.class));

        ConfigurableEnvironment environment = ((AnnotationConfigApplicationContext) beanFactory).getEnvironment();

        System.out.println(environment.getProperty("os.name"));
    }
}
