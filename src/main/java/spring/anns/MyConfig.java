package spring.anns;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import spring.bean.Color;
import spring.bean.Red;
import spring.condition.LinuxCondition;
import spring.condition.MacCondition;
import spring.condition.MySelector;
import spring.condition.MyRegistrar;
import spring.condition.WindowsCondition;
@Import({Color.class, Red.class, MySelector.class,MyRegistrar.class})
@Conditional({MacCondition.class})
@Configuration
//@ComponentScan(value = "spring.anns")
//@ComponentScan(value = "spring.anns", excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})})
@ComponentScan(value = "spring.anns", includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})})
public class MyConfig {

//    @Scope(value = "prototype")
    @Bean("student")
    @Lazy
    public Student student() {
        System.out.println("-------creat bean and put it into container---------");
        Student s = new Student(10, "ben");
        return s;
    }

    @Bean("person")
    @Lazy
    public Student person() {
        System.out.println("-------creat bean and put it into container---------");
        Student s = new Student(10, "person");
        return s;
    }

    @Conditional({WindowsCondition.class})
    @Bean
    public Student bill(){
        return new Student(62, "bill");

    }

    @Conditional({LinuxCondition.class})
    @Bean
    public Student linus(){
        return new Student(48, "linus");

    }

    @Conditional({MacCondition.class})
    @Bean
    public Student jobs(){
        return new Student(55, "Jobs");

    }


}
