package spring.learning.aop;

/**
 * @author liubo
 * @date 2020-01-06 18:13
 * @description
 **/
public class IsAssginableDemo {

    public static void main(String[] args) {
        System.out.println(  RealSubject.class.isAssignableFrom(Subjects.class));
        System.out.println(  Subjects.class.isAssignableFrom(RealSubject.class));
    }
}
