package spring.learning.domain;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author liubo
 * @date 2020-01-16 09:36
 * @description
 **/
//@Data
public class Human {
    @Value("张三")
    private String name;

    @Value("#{20-2}")
    private int age;

    @Value("${human.nickName}")
    private String nickName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public Human(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Human() {
        super();
    }
}
