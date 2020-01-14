package spring.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author liubo
 * @date 2020-01-14 16:39
 * @description
 **/
public class MySelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("========MySelector======");
        importingClassMetadata.getAnnotationTypes().forEach(System.out::println);

        return new String[]{"spring.bean.Blue","spring.bean.Yellow"};
    }
}
