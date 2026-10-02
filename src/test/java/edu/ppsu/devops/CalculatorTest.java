package edu.ppsu.devops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAdd() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-5, App.add(-2, -3));
    }
}