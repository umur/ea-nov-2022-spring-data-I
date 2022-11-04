package com.waa.springdata.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.annotation.Target;

@Aspect
@Component
public class CacheAspect {

    @Autowired
    private CacheRepo cache;
    @Pointcut("@annotation(com.waa.springdata.aop.annotation.CacheThis)")
    public void cachePointCut(){}

    @Around("cachePointCut()")
    public Object readOrUpdateCache(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        var crossedMethodName = proceedingJoinPoint.getSignature().getName();
        var methodFullPath = proceedingJoinPoint.getTarget().getClass().getMethod(crossedMethodName).toString();
        if (cache.getObjectData(methodFullPath) != null) {
            System.out.println("Reading from Cache: " + methodFullPath );
           return cache.getObjectData(methodFullPath);
        }
        var result = proceedingJoinPoint.proceed();
        System.out.println("Reading from DB: " );
        cache.saveObjectData(methodFullPath, result);

        return result;
    }
}
