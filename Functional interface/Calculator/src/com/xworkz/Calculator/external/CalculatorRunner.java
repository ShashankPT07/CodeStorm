package com.xworkz.Calculator.external;



import com.xworkz.Calculator.internal.Calculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a * b;
        int result = calculator.operate(12, 5);
        System.out.println("Multiplication Result: " + result);
    }
}

