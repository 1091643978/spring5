package spring.learning.beanfactory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import spring.learning.aop.TestBean;

/**
 * @author liubo
 * @date 2019-11-13 09:53
 * @description
 **/
@Slf4j
public class AopTest {


    @Test
    public void test() {
        Resource resource = new ClassPathResource("aop.xml");


        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

        int i = reader.loadBeanDefinitions(resource);
        System.out.println("i=" + i);
        TestBean bean = (TestBean) factory.getBean("test");
        bean.test();
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        TestBean bean = (TestBean) context.getBean("test");
        bean.test();
        System.out.println("calling msg...");
    }


}
