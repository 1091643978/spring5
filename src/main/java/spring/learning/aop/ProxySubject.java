package spring.learning.aop;

/**
 * @author liubo
 * @date 2019-12-30 15:09
 * @description
 **/
public class ProxySubject extends Subjects {
    private RealSubject realSubject;


    @Override
    public void request() {

        this.preRequest();

        if (null == realSubject) {
            realSubject = new RealSubject();
        }

        realSubject.request();
        this.postRequest();

    }

    private void preRequest() {
        System.out.println("pre request");
    }

    private void postRequest() {
        System.out.println("post request");
    }
}
