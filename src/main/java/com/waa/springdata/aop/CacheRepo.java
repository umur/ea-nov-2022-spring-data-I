package com.waa.springdata.aop;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CacheRepo {
    public static Map<String, Object> cache = new HashMap<>();

    public CacheRepo() {
        cache.put("test", null);
    }

    public Object getObjectData(String methodName) {
        return cache.getOrDefault(methodName, null);
    }

    public Object saveObjectData(String methodName, Object data) {
        return cache.put(methodName, data);
    }
}
