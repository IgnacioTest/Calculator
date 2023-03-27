package com.example.calculator.service;

import com.example.calculator.utils.Operator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Service
public class CalculatorServiceImpl implements  CalculatorService{

    private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorServiceImpl.class);

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
        Operator operation = Operator.operatorValue(operator);

        switch (operation){
            case SUMA:
                return num1.add(num2).doubleValue();
            case RESTA:
                return num1.subtract(num2).doubleValue();

            default:
                if(LOGGER.isErrorEnabled()){
                    LOGGER.error("Operacion no soportada", operation);
                }
                throw new RuntimeException("Operacion no soportada" + operation);
        }
    }
}
