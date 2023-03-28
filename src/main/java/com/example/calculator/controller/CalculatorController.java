package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import io.corp.calculator.TracerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * The class CalculatorController
 */
@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;
    private TracerImpl tracer = new TracerImpl();

    @GetMapping(value = "/calculate")
    public ResponseEntity<Double> calculate (@RequestParam(name = "num1")BigDecimal num1,
                                             @RequestParam (name = "num2")BigDecimal num2,
                                             @RequestParam (name = "operator")String operator){

        double result = calculatorService.calculate(num1, num2,operator );
        //traceo
        tracer.trace(result);
        return new ResponseEntity<>(result, HttpStatus.OK);


    }
}
