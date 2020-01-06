package spring.learning.aop;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author liubo
 * @date 2020-01-06 20:21
 * @description
 **/
public class CgLibDemo implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class<?> clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        Object object = enhancer.create();

        return object;
    }


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("执行开始" + o.getClass().getName() + " : " + method.getName());

        Object result = methodProxy.invokeSuper(o, objects);

        System.out.println("执行结束");
        return result;
    }

    public static void main(String[] args) {
        CgLibDemo proxy = new CgLibDemo();
        People p = (People) proxy.getProxy(People.class);

        System.out.println("1.name   = " + p.getClass().getName());
        System.out.println("2.parent = " + p.getClass().getSuperclass().getName());
        p.study();

        p.dance();
    }
}
