package org.example.domain;

public class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier){
        return new Money(amount * multiplier,currency);
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
        return new Dollar(amount,"USD");
    }
    public static Money franc(int amount){
        return new Franc(amount,"CHF");
    }
    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount && getCurrency().equals(((Money) o).getCurrency());
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
