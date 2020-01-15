package spring.learning.life;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.life.Car;
import spring.life.CarConfig;

import java.util.Arrays;

/**
 * @author liubo
 * @date 2020-01-14 17:39
 * @description
 **/
public class CarTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
        System.out.println("container created...");
        printBeans(context);

        Car c = (Car)context.getBean("car");
        context.close();
//        c.destroy();
    }

    private void printBeans( ApplicationContext applicationContext) {
        System.out.println("--printBeans--");

        Arrays.asList( applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
