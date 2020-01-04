package spring.learning.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author liubo
 * @date 2020-01-04 15:38
 * @description
 **/
@Aspect
public class AspectJTest {
    @Pointcut("execution(* *.test(..))")
    public void test() {

    }

    @Before("test()")
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @After("test()")
    public void afterTest() {
        System.out.println("afterTest");
    }

    @Around("test()")
    public Object aroundTest(ProceedingJoinPoint p) {
        System.out.println("------around-----start");
        Object o = null;

        try {
            o = p.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("------around-----end");

        return o;
    }
}
