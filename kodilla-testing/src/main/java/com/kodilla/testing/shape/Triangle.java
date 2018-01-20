package com.kodilla.testing.shape;
import java.util.Objects;
public class Triangle implements Shape{
    private String ShapeName;
    private Integer Field;
    public Triangle(String ShapeName, Integer field) {
        this.ShapeName = ShapeName;
        this.Field = field;
    }
    public String getShapeName() {
        return "Triangle";
    }
    public Integer getField() {
        return 12;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(ShapeName, triangle.ShapeName) &&
                Objects.equals(Field, triangle.Field);
    }
    public int hashCode() {
        return Objects.hash(ShapeName, Field);
    }
    public String toString() {
        return "Triangle{" +
                "gShapeName='" + ShapeName + '\'' +
                ", Field=" + Field +
                '}';
    }
}
