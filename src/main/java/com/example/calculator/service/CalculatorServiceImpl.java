package com.example.calculator.service;

import com.example.calculator.utils.Operator;
import com.example.calculator.utils.operations.Addition;
import com.example.calculator.utils.operations.Operation;
import com.example.calculator.utils.operations.Subtract;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


/**
 * The class CalculatorServiceImpl
 */
@Service
public class CalculatorServiceImpl implements  CalculatorService{

    private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorServiceImpl.class);
    @Autowired
    Addition addition;
    @Autowired
    Subtract subtract;

    /**
     * Method to perform the operation
     * @param num1
     * @param num2
     * @param operator
     * @return
     */
    @Override
    public double calculate(BigDecimal num1, BigDecimal num2, String operator) {

        if (LOGGER.isDebugEnabled()){
            LOGGER.debug("Calculating result for: ", num1, num2, operator);
        }
        Operator opt = Operator.operatorValue(operator);


        if (opt.getSign().equals("+")){
            return addition.apply(num1, num2);
        }
        if (opt.getSign().equals("-")){
            return subtract.apply(num1, num2);
        }
        if(LOGGER.isErrorEnabled()){
            LOGGER.error("Operacion no soportada", opt);
        }
        throw new RuntimeException("Operacion no soportada" + opt);

    }
}
