package org.example.domain;

import java.util.Objects;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        Franc Franc = (Franc) o;
        return amount == Franc.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
