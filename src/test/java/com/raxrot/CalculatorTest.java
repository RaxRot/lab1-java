package com.raxrot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    public void testSum() {
        Calculator calc = new Calculator();
        int sum = calc.sum(2, 5);
        assertEquals(7, sum);
    }
}