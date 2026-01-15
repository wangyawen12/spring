package org.example.demospring2;

import org.example.demospring2.util.AOPConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.example.demospring2.proxy.UserService;

public class AOPTest {
    public static void main(String[]args){

       // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AOPConfig.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.login();
    }
}
