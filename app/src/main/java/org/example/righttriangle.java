package org.example;

public class righttriangle extends shape implements polygon {
    protected double l, w;

    public righttriangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    @Override
    public double getArea() {
        return 0.5 * l * w;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(l * l + w * w);
        return l + w + hypotenuse;
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}
