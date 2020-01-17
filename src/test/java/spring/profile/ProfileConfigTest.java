package spring.profile;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.bean.Yellow;
import spring.life.HumanConfig;

import javax.sql.DataSource;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ProfileConfigTest {

    @Test
    public void dataSource() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProfileConfig.class);
        System.out.println("container created...");

       String[] arr=  context.getBeanNamesForType(DataSource.class);

        Arrays.asList(arr).forEach(System.out::println);


    }

    @Test
    public void dataSource2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( );
        context.getEnvironment().setActiveProfiles( "dev");
        context.register(ProfileConfig.class);
        context.refresh();

        System.out.println("container created...");

        String[] arr=  context.getBeanNamesForType(DataSource.class);

        Arrays.asList(arr).forEach(System.out::println);

        Yellow y  = context.getBean(Yellow.class);

        System.out.println(y);


    }

}