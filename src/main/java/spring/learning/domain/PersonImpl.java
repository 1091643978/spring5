package spring.learning.domain;

/**
 * @author liubo
 * @date 2019-12-25 10:22
 * @description
 **/
public class PersonImpl implements Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String say() {
        if (null == name) {
            return "Error: no name";
        }
        return "hi : " + this.name;
    }
}
