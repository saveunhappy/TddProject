package org.example.domain;

import org.example.service.Expression;

public class Money implements Expression{
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier){
        return new Money(amount * multiplier,currency);
    }

    public Expression plus(Money addend){
//        return new Money(amount + addend.amount,currency);
        return new Sum(this,addend);

    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public static Money dollar(int amount){
        return new Money(amount,"USD");
    }
    public static Money franc(int amount){
        return new Money(amount,"CHF");
    }

    public Money reduce(String to){
        return this;
    }
    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount && money.getCurrency().equals(currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
