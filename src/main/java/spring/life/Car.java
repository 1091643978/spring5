package spring.life;

/**
 * @author liubo
 * @date 2020-01-14 17:37
 * @description
 **/
public class Car {
    private String band;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public Car() {
        System.out.println("car constuctor...");
    }

    public void init() {
        System.out.println("car ... init...");
    }

    public void destroy() {
        System.out.println("car ... destroy...");
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "band='" + band + '\'' +
//                '}';
//    }
}
