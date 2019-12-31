package spring.learning.aop;

/**
 * @author liubo
 * @date 2019-12-30 15:08
 * @description
 **/
public class RealSubject extends Subjects {
    @Override
    public void request() {
        System.out.println("from real subject");
    }
}
