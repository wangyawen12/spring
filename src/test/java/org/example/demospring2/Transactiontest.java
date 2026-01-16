package org.example.demospring2;

import org.example.demospring2.dao.AccountRepo;
import org.example.demospring2.pojo.User;
import org.example.demospring2.service.BankService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootTest
public class Transactiontest {

    @Autowired
    BankService bankService;

    @Autowired
    AccountRepo repo;
    @Test
    void contextLoads() {

        System.out.println("Before: " + repo.findAll());
        bankService.transfer(1, 2, 10);
        System.out.println("After success: " + repo.findAll());



    }
}



