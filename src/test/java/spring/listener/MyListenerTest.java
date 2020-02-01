package spring.listener;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class MyListenerTest {
    @Test
    public void listenerTest() {

        AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(ListenerConfig.class);
        log.info("Container created...");
        factory.publishEvent(new ApplicationEvent(new String("我发个事件")) {
        });

        Apple a = (Apple) factory.getBean("apple");
        System.out.println(a);
        factory.close();
    }
}