package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class circleTest {

    @Test
    void testCircleArea() {
        circle c = new circle(5);
        assertEquals(Math.PI * 25, c.getArea(), 0.0001);
    }

    @Test
    void testCirclePerimeter() {
        circle c = new circle(5);
        assertEquals(2 * Math.PI * 5, c.getPerimeter(), 0.0001);
    }

    @Test
    void testCircleCircumference() {
        circle c = new circle(5);
        assertEquals(2 * Math.PI * 5, c.getCircumference(), 0.0001);
    }
}
