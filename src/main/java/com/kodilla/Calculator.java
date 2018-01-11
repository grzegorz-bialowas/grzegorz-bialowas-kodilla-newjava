package com.kodilla;
public class Calculator {
    public int addAToB(int a, int b) {
        return a + b;
    }
    public int substractAFromB(int a, int b) {
        return a - b;
    }
}
class CalculatorProcessor
{
    public static void main(String[] args) {
        Calculator simpleCalculator;
        simpleCalculator = new Calculator();
        int result = simpleCalculator.addAToB(5, 5);
        System.out.println(result);
    }
}
