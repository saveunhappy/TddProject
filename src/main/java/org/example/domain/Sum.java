package org.example.domain;

import org.example.service.Expression;

public class Sum implements Expression {
    private Money augend;
    private Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money getAugend() {
        return augend;
    }

    public void setAugend(Money augend) {
        this.augend = augend;
    }

    public Money getAddend() {
        return addend;
    }

    public void setAddend(Money addend) {
        this.addend = addend;
    }

    public Money rate(String to){
        int amount = augend.amount + addend.amount;
        return new Money(amount,to);
    }

    @Override
    public Money reduce(Bank bank, String to) {
        return null;
    }
}
