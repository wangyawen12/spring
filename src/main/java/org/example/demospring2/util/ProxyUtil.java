package org.example.demospring2.util;

import org.example.demospring2.proxy.TimerInvocationHandler;

import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Object newProxyInstance(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new TimerInvocationHandler(target));
    }
}
