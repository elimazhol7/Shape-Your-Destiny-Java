package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class isoscelesrighttriangleTest {
    @Test
    void testIsoRightTriangleAreaPerimeterSides() {
        isoscelesrighttriangle iso = new isoscelesrighttriangle(5);
        assertEquals(12.5, iso.getArea(), 0.0001);
        assertEquals(5 + 5 + Math.sqrt(50), iso.getPerimeter(), 0.0001);
        assertEquals(3, iso.numberOfSides());
    }
}
