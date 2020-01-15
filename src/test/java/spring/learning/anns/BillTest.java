package spring.learning.anns;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import spring.anns.MyConfig;
import spring.anns.Student;
import spring.regist.MyFactoryBean;

import java.util.Arrays;

/**
 * @author liubo
 * @date 2020-01-13 20:38
 * @description
 **/
public class BillTest {

    @Test
    public void testImport() {

        ApplicationContext beanFactory = new AnnotationConfigApplicationContext(MyConfig.class);

        printBeans(beanFactory.getBeanDefinitionNames());

        Object myFactoryBean = beanFactory.getBean("myFactoryBean");
        Object b2 = beanFactory.getBean("myFactoryBean");
        Object b3 = beanFactory.getBean("&myFactoryBean");

        System.out.println("bean的类型: " + myFactoryBean.getClass());
        System.out.println(myFactoryBean == b2);
        System.out.println("bean的类型: " + b3.getClass());

        MyFactoryBean b4= (MyFactoryBean)b3;
        try {
          Object o5 =  b4.getObject();
            System.out.println("o5的类型: " + o5.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void getBD() {

        ApplicationContext beanFactory = new AnnotationConfigApplicationContext(MyConfig.class);

        BeanDefinition
                bd = ((AnnotationConfigApplicationContext) beanFactory).getBeanDefinition("appleNewton");

        System.out.println(bd.isSingleton());
        System.out.println(bd.isPrototype());
    }


    @Test
    public void bill() {

        ApplicationContext beanFactory = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("============");
        System.out.println(beanFactory.getBeansOfType(Student.class));

        printBeans(beanFactory.getBeanDefinitionNames());

        ConfigurableEnvironment environment = ((AnnotationConfigApplicationContext) beanFactory).getEnvironment();

        System.out.println(environment.getProperty("os.name"));
    }

    private void printBeans(String[] beanDefinitionNames) {
        System.out.println("--printBeans--");
        Arrays.asList(beanDefinitionNames).forEach(System.out::println);

    }
}
