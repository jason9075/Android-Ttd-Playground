package com.jason9075.androidttdplayground.bank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by jason9075 on 2016/3/14.
 */
public class MoneyTest {
    @Test
    public void MoneyAddTest() throws Exception {
        Money money = new Money(10, "TWD");
        assertEquals(new Money(20, "TWD"), money.addMoney(money));
        assertNotEquals(new Money(21, "TWD"), money.addMoney(money));
    }
}
