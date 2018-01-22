package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
        PoemBeautifier beauty = new PoemBeautifier ();
        String lower = "AABBCC";
        String higher = "aabbcc";
        String text = "My First Lambda Text";
        String love = "I LOVE YOU";
        String lowerValue = lower.toLowerCase();
        String higherValue = higher.toUpperCase();
        String textHigher = text.toUpperCase();
        String textLower = text.toLowerCase();
        beauty.beautify((() -> System.out.println("")));
        beauty.beautify((() -> System.out.println("Let's test: My first lambda text.")));
        beauty.beautify((() -> System.out.println(lowerValue + "  " + "My first lambda text" + "   " +  higherValue )));
        beauty.beautify((() -> System.out.println(lowerValue+ "  " + textHigher + "  " + textLower + "  " +higherValue)));
        beauty.beautify((() -> System.out.println(love +"***"+text+"***"+love)));
        beauty.beautify((() -> System.out.println("***" + love.toLowerCase() +"<+++>"+text.toUpperCase()+"<+++>"+love.toLowerCase() + "***")));
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
