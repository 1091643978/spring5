package spring.life;

/**
 * @author liubo
 * @date 2020-01-14 17:37
 * @description
 **/
public class Car {
    public Car() {
        System.out.println("car constuctor...");
    }

    public void init() {
        System.out.println("car ... init...");
    }

    public void destroy() {
        System.out.println("car ... destroy...");
    }
}
