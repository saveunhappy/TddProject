package org.example.domain;

import java.util.Objects;

public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
         return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
