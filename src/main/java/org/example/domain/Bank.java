package org.example.domain;

import org.example.service.Expression;

public class Bank {
    public Money reduce(Expression source,String to){
        Sum sum = (Sum) source;
        return sum.reduce(to);
    }
}
