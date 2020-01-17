package spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

/**
 * @author liubo
 * @date 2020-01-16 17:07
 * JoinPoint joinPoint 这个参数要出现在每一个参数
 **/
@Aspect
public class LogAspect {

    @Pointcut("execution(public int spring.aop.MathCalculator.*(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void logStart(JoinPoint jp) {
        System.out.println("===> before divide getSignature is :" + jp.getSignature().getName());
        System.out.println("===> before divide praram is :" + Arrays.asList(jp.getArgs()));
    }

    @After("pointCut()")
    public void logEnd() {
        System.out.println("===> end divide");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(JoinPoint joinPoint,Object result) {
        System.out.println(joinPoint.getSignature().getName()+"---> divide return {}" + result);
    }


    //---------------------------------------------------------------------
    // JoinPoint joinPoint 这个参数要出现在每一个参数
    //---------------------------------------------------------------------

    @AfterThrowing(value = "pointCut()",throwing = "ex")
    public void logException(JoinPoint joinPoint,Exception ex) {
        System.out.println(joinPoint.getSignature().getName()+"---> divide exception:" +ex);
    }
}
