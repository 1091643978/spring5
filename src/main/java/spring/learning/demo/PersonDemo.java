package spring.learning.demo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import spring.learning.domain.Person;

public class PersonDemo {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("person.xml");


        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

        int i = reader.loadBeanDefinitions(resource);
        System.out.println("i=" + i);
        Person p = (Person) factory.getBean("person");
        System.out.println(p.say());
    }
}
