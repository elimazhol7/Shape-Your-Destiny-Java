package org.example;

public class rectangle extends shape implements polygon {
    protected double l, w;

    public rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    @Override
    public double getArea() {
        return l * w;
    }

    @Override
    public double getPerimeter() {
        return 2 * (l + w);
    }

    @Override
    public int numberOfSides() {
        return 4;
    }
}
