package org.example.domain;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}