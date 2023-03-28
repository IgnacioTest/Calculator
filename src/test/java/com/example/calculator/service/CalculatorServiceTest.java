package com.example.calculator.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {

    @Autowired
    private  CalculatorService calculatorService;


    private BigDecimal num1 = new BigDecimal("20");
    private BigDecimal num2 = new BigDecimal("12");

    private String operator = "";

    @Test
    void testAddOK() throws Exception {
        operator = "suma";
        double result = calculatorService.calculate(num1,num2,operator);
        assertEquals(32.0, result);
    }

    @Test
    void testSubtractOk(){
        operator = "resta";
        double result = calculatorService.calculate(num1,num2,operator);
        assertEquals(8, result);
    }

}
