package org.example.domain;

public abstract class Money {
    protected int amount;
    public abstract Money times(int multiplier);
    public abstract String currency();
    public static Money dollar(int amount){
        return new Dollar(amount);
    }
    public static Money franc(int amount){
        return new Franc(amount);
    }
    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
