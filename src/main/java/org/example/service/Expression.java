package org.example.service;

import org.example.domain.Bank;
import org.example.domain.Money;

public interface Expression {
    Money reduce(Bank bank,String to);

}
