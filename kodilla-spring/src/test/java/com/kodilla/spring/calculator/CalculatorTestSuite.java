package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        //When
        double add = calculator.add(10, 20);
        double sub = calculator.sub(40, 20);
        double mul = calculator.mul(20, 10);
        double div = calculator.div(20, 10);
        //Then
        Assert.assertEquals(30, add, 1);
        Assert.assertEquals(20, sub, 1);
        Assert.assertEquals(200, mul, 1);
        Assert.assertEquals(2, div, 1);
    }
}
