package org.example;

import org.example.domain.Dollar;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10,product.getAmount());
        product = five.times(3);
        assertEquals(15,product.getAmount());
    }
    @Test
    public void testEquality(){
        assertEquals(new Dollar(5),new Dollar(5));

    }
}
