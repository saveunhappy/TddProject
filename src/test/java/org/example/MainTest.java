package org.example;

import org.example.domain.Dollar;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10,five.getAmount());
        five.times(3);
        assertEquals(15,five.getAmount());
    }
}
