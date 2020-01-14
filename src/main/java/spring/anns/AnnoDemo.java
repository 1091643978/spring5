package spring.anns;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author liubo
 * @date 2020-01-10 18:28
 * @description
 **/
public class AnnoDemo {

    public static void main(String[] args) {
        ApplicationContext beanFactory = new AnnotationConfigApplicationContext(MyConfig.class);

        System.out.println("container initialized....");
        Student s = (Student) beanFactory.getBean("student");
//        Student s2 = beanFactory.getBean(Student.class);
//        System.out.println(s);
//        System.out.println(s2);
//
//
//        String[] names = beanFactory.getBeanNamesForType(Student.class);
//        Arrays.asList(names)
//                .forEach(x -> System.out.println(x));
//
        String[] bdn  =  beanFactory.getBeanDefinitionNames();
        Arrays.asList(bdn)
                .forEach(x -> System.out.println(x));
//
//        System.out.println(s==s2);
    }


}
