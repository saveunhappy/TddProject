package org.example.domain;

import java.util.Objects;

public class Dollar extends Money{

    public Dollar(int amount,String currency) {
        super(amount,currency);
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier,currency);
    }

    @Override
    public String currency() {
        return currency;
    }
    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
