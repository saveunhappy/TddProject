package org.example.domain;

import java.util.Objects;

public class Franc extends Money{


    public Franc(int amount,String currency) {
        this.amount = amount;
        this.currency = currency;
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

    @Override
    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

    @Override
    public String currency() {
        return "CHF";
    }


    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
