package com.example.calculator.utils.operations;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * The class Subtract
 */
@Component
public class Subtract implements  Operation{
    @Override
    public double apply(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2).doubleValue();
    }
}
