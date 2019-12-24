package spring.learning.beanfactory;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import spring.learning.beans.Coffee;
import spring.learning.beans.Milk;

import java.io.IOException;

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

    @Test
    public void aliasesTest() {
        BeanFactory container = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));

        String[] ali = container.getAliases("coffee");

        System.out.println(ali.length);
    }


    @Test
    public void getType() {
        BeanFactory container = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));

        Class c = container.getType("coffee");

        System.out.println(c.getName());
    }


    @Test
    public void contains() {
        BeanFactory container = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));

        System.out.println(container.containsBean("milk"));
    }


    @Test
    public void isSingleton() {
        BeanFactory container = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));

        System.out.println(container.isSingleton("coffee"));
    }


    @Test
    public void isPrototype() {
        BeanFactory container = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));

        System.out.println(container.isPrototype("coffee"));
    }


    @Test
    public void isTypeMatch() {
        BeanFactory container = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));

        System.out.println(container.isTypeMatch("coffee", Coffee.class));
        System.out.println(container.isTypeMatch("coffee", Milk.class));
    }


    @Test
    public void defaultList() throws IOException {
        ClassPathResource cp = new ClassPathResource("beanFactoryTest.xml");

        Resource r =  cp;

        System.out.println(r.getURL());
        System.out.println(r.getURI());
        System.out.println(r.getFilename());
        System.out.println(r.contentLength());
        System.out.println(r.isFile());
        System.out.println(r.isOpen());
        System.out.println(r.isReadable());




        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

        reader.loadBeanDefinitions(cp);

        System.out.println(factory.isTypeMatch("coffee", Coffee.class));
        System.out.println(factory.isTypeMatch("coffee", Milk.class));
    }
}
