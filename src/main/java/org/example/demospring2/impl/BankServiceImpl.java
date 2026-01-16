package org.example.demospring2.impl;

import org.example.demospring2.dao.AccountRepo;
import org.example.demospring2.entity.Account;
import org.example.demospring2.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankServiceImpl implements BankService {
    @Autowired
    private AccountRepo repo;

//    private final AccountRepo repo;
//
//    public BankServiceImpl(AccountRepo repo) {
//        this.repo = repo;
//    }

    @Transactional
    public void transfer(int fromId, int toId, int amount) {
        Account from = repo.findById(fromId).orElseThrow();
        Account to = repo.findById(toId).orElseThrow();

        if (from.getBalance() < amount) {
            throw new RuntimeException("Not enough money");
        }

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

        // JPA will flush these changes at commit time
        // (you can also call repo.save(from); repo.save(to); but it's not required)
    }
}
