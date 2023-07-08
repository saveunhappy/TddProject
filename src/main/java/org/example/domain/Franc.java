package org.example.domain;

import java.util.Objects;

public class Franc extends Money{

    private String currency;

    public Franc(int amount) {
        this.amount = amount;
        currency = "CHF";
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
        return new Franc(amount * multiplier);
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
