package org.example.demospring2.transaction;

import org.example.demospring2.DemoSpring2Application;
import org.example.demospring2.dao.AccountRepo;
import org.example.demospring2.service.BankService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class TranTest {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoSpring2Application.class, args);

        AccountRepo repo = ctx.getBean(AccountRepo.class);
        BankService bankService = ctx.getBean(BankService.class);

        System.out.println("Before: " + repo.findAll());
        bankService.transfer(1, 2, 10);
        System.out.println("After success: " + repo.findAll());

        ctx.close();
    }
}
