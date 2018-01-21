package com.kodilla.testing;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.*;
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    private ShapeCollector shapeCollector;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        //Given
        Shape shape = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector(shape);
        //When
        shapeCollector.addFigure(shape);
        //Then
        Assert.assertEquals(1, shapeCollector.getFigureQuantity(1));
    }
    @Test
    public void testRemoveFigure() {
        //Given
        Shape shape = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector(shape);
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assert.assertEquals(0, shapeCollector.getFigureQuantity(0));
        Assert.assertTrue(result);
    }
    @Test
    public void testGetFigure() {
        //Given
        Shape shape = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector(shape);
        Shape checkShape = shapeCollector.addFigure(shape);
        //When
        shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(checkShape, shapeCollector.getFigure(0));
    }
}
