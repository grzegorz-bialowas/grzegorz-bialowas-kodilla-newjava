package com.kodilla.testing.Shape;
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
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(shape);
        //Then
        Assert.assertEquals(1, shapeCollector.getFigureQuantity());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        Shape shape = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assert.assertEquals(0, shapeCollector.getFigureQuantity());
        Assert.assertTrue(result);
    }
    @Test
    public void testGetFigure() {
        //Given
        Shape shape = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape);
        //When
        Shape checkShape = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(checkShape, shape);
    }
}
