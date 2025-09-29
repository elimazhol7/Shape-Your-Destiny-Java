package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class righttriangleTest {
    @Test
    void testRightTriangleAreaPerimeterSides() {
        righttriangle t = new righttriangle(3, 4);
        assertEquals(6.0, t.getArea(), 0.0001);
        assertEquals(12.0, t.getPerimeter(), 0.0001); // 3 + 4 + 5
        assertEquals(3, t.numberOfSides());
    }
}
