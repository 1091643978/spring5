package spring.condition;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import spring.bean.Apple;

/**
 * @author liubo
 * @date 2020-01-14 16:59
 * @description
 **/
public class MyRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean red = registry.containsBeanDefinition("student");
        boolean yellow = registry.containsBeanDefinition("person");

        if (red && yellow) {
            BeanDefinition a = new RootBeanDefinition(Apple.class);
            a.setScope("prototype");
            registry.registerBeanDefinition("appleNewton", a);
        }

    }
}
