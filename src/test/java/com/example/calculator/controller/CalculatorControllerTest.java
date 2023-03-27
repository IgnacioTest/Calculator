package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import com.example.calculator.service.CalculatorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class CalculatorControllerTest {

    @Autowired
    private CalculatorController calculatorController;

    private BigDecimal num1 = new BigDecimal("10");
    private BigDecimal num2 = new BigDecimal("3");

    private String operator = "";


    @Test
    void testAddOK() throws Exception {
        operator = "suma";
        ResponseEntity <Double>result = calculatorController.calculate(num1, num2, operator);
        assertEquals(13.0, result.getBody().doubleValue());
    }

    @Test
    void testSubtractKo(){
        operator = "resta";
        ResponseEntity <Double>result = calculatorController.calculate(num1, num2, operator);
        assertEquals(7.0, result.getBody().doubleValue());
    }
}
