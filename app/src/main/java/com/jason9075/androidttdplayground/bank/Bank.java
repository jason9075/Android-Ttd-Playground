package com.jason9075.androidttdplayground.bank;

/**
 * Created by jason9075 on 2016/3/14.
 */
public class Bank {
    private String owner;
    private Money balance;

    public Bank(String owner, Money balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public Money getBalance() {
        return balance;
    }

    public void deposit(Money money) {
        this.balance = new Money(balance.getAmount() + money.getAmount(), money.getCurrency());
    }

    public void withdraw(Money money) {
        this.balance = new Money(balance.getAmount() - money.getAmount(), money.getCurrency());
    }
}
