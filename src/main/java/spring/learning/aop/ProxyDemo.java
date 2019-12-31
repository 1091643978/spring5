package spring.learning.aop;

/**
 * @author liubo
 * @date 2019-12-30 15:13
 * @description
 **/
public class ProxyDemo {
    public static void main(String[] args) {
        Subjects s = new ProxySubject();

        s.request();
    }
}
