package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class rectangleTest {
    @Test
    void testRectangleAreaPerimeterSides() {
        rectangle r = new rectangle(4, 6);
        assertEquals(24.0, r.getArea(), 0.0001);
        assertEquals(20.0, r.getPerimeter(), 0.0001);
        assertEquals(4, r.numberOfSides());
    }
}
