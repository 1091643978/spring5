package spring.listener;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class MyListenerTest {
    @Test
    public void listenerTest() {

        AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(ListenerConfig.class);
        log.info("Container created...");

        factory.close();
    }
}