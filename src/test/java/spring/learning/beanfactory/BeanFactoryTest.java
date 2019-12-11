package spring.learning.beanfactory;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import spring.learning.beans.Coffee;

import static org.junit.Assert.assertEquals;

/**
 * @author liubo
 * @date 2019-11-13 09:53
 * @description
 **/
public class BeanFactoryTest {

    @Test
    public void xmlBeanFactoryTest() {
        BeanFactory container = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));

        Coffee coffeeBean = (Coffee) container.getBean("coffee");

        assertEquals(coffeeBean.getType(), "Cappuccino");
    }
}
