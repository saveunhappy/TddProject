package org.example.domain;

import org.example.service.Expression;

public class Bank {
    public Money reduce(Expression source,String to){
//        if(source instanceof Money) return (Money) source;
//        Sum sum = (Sum) source;
//        return sum.reduce(to);
        return source.reduce(to);
    }
}
