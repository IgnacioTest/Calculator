package com.example.calculator.utils.operations;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * The class Addition
 */
@Component
public class Addition implements  Operation{
    @Override
    public double apply(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2).doubleValue();
    }

}
