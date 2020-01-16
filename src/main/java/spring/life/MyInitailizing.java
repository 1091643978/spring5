package spring.life;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author liubo
 * @date 2020-01-15 18:29
 * @description
 **/
public class MyInitailizing implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("===>afterPropertiesSet...");
    }
}
