package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class squareTest {
    @Test
    void testSquareAreaPerimeterSides() {
        square s = new square(5);
        assertEquals(25.0, s.getArea(), 0.0001);
        assertEquals(20.0, s.getPerimeter(), 0.0001);
        assertEquals(4, s.numberOfSides());
    }
}
