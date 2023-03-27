package com.example.calculator.utils;

public enum Operator {

    SUMA("+"),
    RESTA("-");

    private String sign;

    Operator(String sign){
        this.sign = sign;
    }

    private static final Operator[] values = new Operator[]{SUMA, RESTA};

    public String getSign() {
        return sign;
    }

    public static  Operator operatorValue (String value){

        for (int i = 0; i<values.length; i++){
            Operator operator = values [i];
            if (value.equalsIgnoreCase(operator.name()) || value.equalsIgnoreCase(operator.getSign())){
                return operator;
            }
        }
        throw new RuntimeException("Operacion no soportada: " +value);
    }
}
