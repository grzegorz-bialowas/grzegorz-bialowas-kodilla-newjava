package com.kodilla.testing.shape;
import java.util.ArrayList;
public class ShapeCollector {
    private Shape shape;
    private ArrayList<Shape> figureList = new ArrayList<Shape>();
    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }
    public Shape addFigure(Shape shape) {
        figureList.add(shape);
        return shape;
    }
    public boolean removeFigure(Shape shape){
        figureList.remove(shape);
        return false;
    }
    public Shape getFigure(int n) {
        return figureList.get(n);
    }
}



