package org.example.service;

import org.example.domain.Money;

public interface Expression {
    Money reduce(String to);

}
