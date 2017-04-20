package com.zjc.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by zjc on 2017/4/17.
 *AOP学习：log
 */
public class Log implements MethodBeforeAdvice{
    /**
     * @param method 被调用的方法对象
     * @param args 被调用的方法参数
     * @param target 目标对象
     * @throws Throwable
     */
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"方法被执行");
    }
}
