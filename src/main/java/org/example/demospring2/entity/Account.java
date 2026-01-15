package org.example.demospring2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "balance")
    private Integer balance;

    public Account() {}

    public Account(Integer id, Integer balance) {
        this.id = id;
        this.balance = balance;
    }

    public Integer getId() { return id; }
    public Integer getBalance() { return balance; }
    public void setBalance(Integer balance) { this.balance = balance; }
}
