package com.kodilla.spring.shape;

import com.kodilla.spring.SpringRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuite {
    @Test
    public void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Circle.class);
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a circle", name);
    }
    @Test
    public void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Triangle.class);
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a triangle.", name);
    }
    @Test
    public void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Square.class);
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a square.", name);
    }
}