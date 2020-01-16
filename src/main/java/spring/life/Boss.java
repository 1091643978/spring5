package spring.life;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author liubo
 * @date 2020-01-16 14:16
 * @description
 **/
@Slf4j
@Component
public class Boss {
//    @Autowired
    private Car car;

    public Car getCar() {
        return car;
    }

//    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    //如果只有一个有参构造器，autowire可以省略
//    @Autowired
    public Boss(@Autowired Car car) {
        this.car = car;
        log.info("有参构造器....");
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
