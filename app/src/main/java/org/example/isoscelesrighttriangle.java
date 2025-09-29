package org.example;

public class isoscelesrighttriangle extends righttriangle {
    public isoscelesrighttriangle(double leg) {
        super(leg, leg);
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}
