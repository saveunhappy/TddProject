package org.example.domain;

import java.util.Objects;

public class Dollar extends Money{

    public Dollar(int amount,String currency) {
        this.amount = amount;
        this.currency = currency;
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
        return new Dollar(amount * multiplier,null);
    }

    @Override
    public String currency() {
        return "USD";
    }
    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
