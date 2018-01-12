package com.kodilla.testing.calculator;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int substract(int a, int b) {
        return a - b;
    }
}
class Calculate {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addResult = calculator.add(10, 10);
        if (addResult == 20) {
            System.out.println("Add result is good.");
        } else {
            System.out.println("Calculator is broken.");
        }
        int substractResult = calculator.substract(20, 10);
        if (substractResult == 10) {
            System.out.println("Substract result is good.");
        } else {
            System.out.println("Calculator is broken.");
        }
    }
}
