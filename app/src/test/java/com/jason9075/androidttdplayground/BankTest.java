package com.jason9075.androidttdplayground;

import com.jason9075.androidttdplayground.model.Bank;
import com.jason9075.androidttdplayground.model.Money;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jason9075 on 2016/3/14.
 */
public class BankTest {

    @Test
    public void BankTest() throws Exception {
        Bank bank = new Bank("Jason", new Money(100, "TWD"));
        assertEquals(bank.getBalance(), new Money(100, "TWD"));
        bank.deposit(new Money(50, "TWD"));
        assertEquals(bank.getBalance(), new Money(150, "TWD"));
        bank.withdraw(new Money(60, "TWD"));
        assertEquals(bank.getBalance(), new Money(90, "TWD"));
    }
}
