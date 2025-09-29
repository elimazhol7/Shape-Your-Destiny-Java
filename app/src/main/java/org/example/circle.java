package org.example;

public class circle extends shape {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return getCircumference(); // perimeter == circumference
    }

    // New method
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

