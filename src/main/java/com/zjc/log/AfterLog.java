package com.zjc.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by zjc on 2017/4/18.
 *
 */
public class AfterLog implements AfterReturningAdvice{
    /**
     * 目标方法执行后的通知
     * @param returnValue  返回值
     * @param method       被调用的方法对象
     * @param args         被调用方法的参数
     * @param target       被调用的方法对象的目标对象
     * @throws Throwable
     */
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"被成功执行，返回值是："+returnValue);
    }
}
