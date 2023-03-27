package com.example.calculator.service;

import java.math.BigDecimal;

public interface CalculatorService {

    /**
     * Method to calculate with two numbers and one type of operator
     * @param num1
     * @param num2
     * @param operator
     * @return result
     */
    double calculate (BigDecimal num1, BigDecimal num2, String operator);
}
