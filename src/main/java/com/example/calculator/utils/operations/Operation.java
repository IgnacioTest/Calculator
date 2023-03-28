package com.example.calculator.utils.operations;

import java.math.BigDecimal;

public interface Operation {
    double apply (BigDecimal num1, BigDecimal num2);
}
