package spring.life;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author liubo
 * @date 2020-01-15 18:33
 * @description
 **/
@Slf4j
public class Truck implements InitializingBean, DisposableBean {
    public Truck() {
        log.info("===>truck constructor...");
    }

    @Override
    public void destroy() throws Exception {
        log.info("===>truck destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("===>truck afterPropertiesSet");
    }
}
