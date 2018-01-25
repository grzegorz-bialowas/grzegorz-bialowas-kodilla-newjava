package com.kodilla.testing.shape;
import java.util.ArrayList;
public class ShapeCollector {
    private ArrayList<Shape> figureList = new ArrayList<Shape>();
    public Shape addFigure(Shape shape) {
        figureList.add(shape);
        return shape;
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (figureList.contains(shape)) {
            figureList.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n) {
        return figureList.get(n);
    }
    public int getFigureQuantity() {
        return figureList.size();
    }
}



