package spring.listener;

/**
 * @author liubo
 * @date 2020-02-01 00:26
 * @description
 **/
public class Apple {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                '}';
    }
}
