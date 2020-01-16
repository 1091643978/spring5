package spring.life;

/**
 * @author liubo
 * @date 2020-01-16 14:30
 * @description
 **/
public class Rich {

    private Car car;


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Rich{" +
                "car=" + car +
                '}';
    }
}
