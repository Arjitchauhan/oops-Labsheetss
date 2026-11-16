package lab_sheet_10.Q06;

import java.util.ArrayList;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class CircleAreas {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2));
        shapes.add(new Circle(4));
        shapes.add(new Circle(5));

        for (Shape shape : shapes) {
            System.out.println("Circle area: " + shape.area());
        }
    }
}
