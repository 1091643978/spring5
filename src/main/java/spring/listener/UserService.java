package spring.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author liubo
 * @date 2020-01-30 19:49
 * @description
 **/
@Slf4j
@Service
public class UserService {

    @EventListener(classes = {ApplicationEvent.class})
    public void listen(ApplicationEvent event) {
        log.info("User service 监听到的事件:{}", event);
    }
}
