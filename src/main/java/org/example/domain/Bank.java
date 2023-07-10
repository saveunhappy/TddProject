package org.example.domain;

import org.example.service.Expression;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<Object, Object> rates = new HashMap<>();

    public Money reduce(Expression source, String to) {
//        if(source instanceof Money) return (Money) source;
//        Sum sum = (Sum) source;
//        return sum.reduce(to);
        return source.reduce(this, to);
    }

    public int rate(String from, String to) {
//        return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
        if (from.equals(to)) return 1;
        return (Integer) rates.get(new Pair(from, to));
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }
}
