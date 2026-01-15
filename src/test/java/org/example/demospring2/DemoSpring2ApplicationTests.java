package org.example.demospring2;


import org.example.demospring2.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class DemoSpring2ApplicationTests {

    @Test
    void contextLoads() {

        ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
        User user = container.getBean("userBean", User.class);

        System.out.println(user.getPassword());

    }

}
