package spring.learning.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.learning.domain.Person;

/**
 * @author liubo
 * @date 2020-01-10 10:47
 * @description
 **/
public class MyContext extends ClassPathXmlApplicationContext {
    public MyContext(String configLocation) throws BeansException {

        super(configLocation);
    }

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        super.setAllowBeanDefinitionOverriding(true);
        super.customizeBeanFactory(beanFactory);
    }

    @Override
    protected void initPropertySources() {
        getEnvironment().setRequiredProperties("VAR");
    }

    public static void main(String[] args) {
        ApplicationContext bf = new MyContext("person.xml");
        Person p = (Person) bf.getBean("person");

        p.say();
    }
}
