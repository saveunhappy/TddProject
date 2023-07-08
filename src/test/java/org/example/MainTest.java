package org.example;

import org.example.domain.Dollar;
import org.example.domain.Franc;
import org.example.domain.Money;
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
        assertEquals(Money.franc(5),Money.franc(5));
        assertNotEquals(Money.franc(5),Money.franc(6));
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
    public void testDifferentClassEquality(){
        assertEquals(new Money(10,"CHF"),new Franc(10,"CHF"));
        assertEquals(new Money(10,"USD"),new Dollar(10,"USD"));
    }
}
