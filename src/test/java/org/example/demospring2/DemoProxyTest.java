package org.example.demospring2;

import org.example.demospring2.proxy.TimerMethodInterceptor;
import org.example.demospring2.proxy.UserService;
import net.sf.cglib.proxy.Enhancer;

public class DemoProxyTest {

    public static void main(String[]args){
//        OrderService target = new OrderServiceImpl();
//        OrderService proxy = (OrderService)Proxy.newProxyInstance(target.getClass().getClassLoader(),
//                            target.getClass().getInterfaces(),
//                             new TimerInvocationHandler(target) );
//        OrderService proxy = (OrderService) ProxyUtil.newProxyInstance(target);
//        proxy.generate();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);//target class
        //enhancer.setCallback(new TimerMethodInterceptor());
        enhancer.setCallback(new TimerMethodInterceptor());
        UserService proxy = (UserService)enhancer.create();
        proxy.login();

    }
}
