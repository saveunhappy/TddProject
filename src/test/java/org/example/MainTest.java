package org.example;

import org.example.domain.Bank;
import org.example.domain.Money;
import org.example.domain.Sum;
import org.example.service.Expression;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testMultiplication(){
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10),five.times(2));
        assertEquals(Money.dollar(15),five.times(3));
    }
    @Test
    public void testEquality(){
        assertEquals(Money.dollar(5),Money.dollar(5));
        assertNotEquals(Money.dollar(5),Money.dollar(6));
        assertNotEquals(Money.franc(5),Money.dollar(5));
    }

    @Test
    public void testFrancMultiplication(){
        Money five = Money.franc(5);
        assertEquals(Money.franc(10),five.times(2));
        assertEquals(Money.franc(15),five.times(3));
    }
    @Test
    public void testCurrency(){
        assertEquals("USD",Money.dollar(1).getCurrency());
        assertEquals("CHF",Money.franc(1).getCurrency());
    }
    @Test
    public void testSimpleAddition(){
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduce = bank.reduce(sum,"USD");
        assertEquals(Money.dollar(10),reduce);
    }
    @Test
    public void testPlusReturnSum(){
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five,sum.getAugend());
        assertEquals(five,sum.getAddend());
    }
}
