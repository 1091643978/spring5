package spring.life;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author liubo
 * @date 2020-01-15 18:50
 * @description
 **/
@Slf4j
public class Dog implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public Dog() {
        log.info("===> dog constructor...");
    }

    @PostConstruct
    public void init() {
        log.info("===> dog @PostConstruct...");
    }

    @PreDestroy
    public void destroy() {
        log.info("===> dog   @PreDestroy  ...");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
