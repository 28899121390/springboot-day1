package com.baizhi.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LogAspect {

     /*切入点*/
    @Pointcut(value = "execution(* com.baizhi.service.*.*(..))")
    public void pp(){

    }
/*    *//*通知*//*
    //spring  提供
    @Before(value = "pp()")
    public void testBefore(JoinPoint joinPoint){
        //参数列表
        Object[] args = joinPoint.getArgs();
        //方法所在类 的对象
        Object target = joinPoint.getTarget();
        //代理对象
        Object aThis = joinPoint.getThis();
        //方法对象
        Signature signature =joinPoint.getSignature();
        System.out.println("this is before Advice");
    }


    @After(value = "pp()")
    public void testAfter(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        //方法所在类 的对象
        Object target = joinPoint.getTarget();
        //代理对象
        Object aThis = joinPoint.getThis();
        //方法对象
        Signature signature =joinPoint.getSignature();

        System.out.println("this is after Advice");
    }*/

    @Around(value = "pp()")
    public Object testAround(ProceedingJoinPoint proceedingJoinPoint) {
        Object proceed=null;
        try {
            System.out.println("method before");
             proceed = proceedingJoinPoint.proceed();
            System.out.println("method after");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return proceed;
    }

}
