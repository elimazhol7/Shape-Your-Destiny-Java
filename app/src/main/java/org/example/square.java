package org.example;

public class square extends rectangle {
    public square(double side) {
        super(side, side);
    }

    @Override
    public int numberOfSides() {
        return 4;
    }
}
