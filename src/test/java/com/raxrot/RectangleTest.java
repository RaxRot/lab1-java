package com.raxrot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    public void testArea() {
        Rectangle rect = new Rectangle();
        assertEquals(15, rect.area(3,5));
        assertEquals(40, rect.area(5,8));
        assertEquals(8, rect.area(2,4));
    }

    @Test
    public void testPerimeter() {
        Rectangle rect = new Rectangle();
        assertEquals(16, rect.perimeter(3,5));
        assertEquals(26, rect.perimeter(5,8));
        assertEquals(12, rect.perimeter(2,4));
    }

    @Test
    public void testIsTriangle() {
        Rectangle rect = new Rectangle();
        assertTrue(rect.isTriangle(3,4,5));
        assertFalse(rect.isTriangle(1,2,10));
    }
}