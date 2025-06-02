package edu.unac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.subtract(5, 3));
        assertEquals(-1, calc.subtract(2, 3));
        assertEquals(0, calc.subtract(7, 7));
    }

    @Test
    void testDivision() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.divide(8, 2));
        assertEquals(3, calc.divide(10, 3));
        assertEquals(0, calc.divide(0, 5));
    }

    @Test
    void testDivisionByZeroThrowsException() {
        Calculator calc = new Calculator();
        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> {
            calc.divide(10, 0);
        });
        assertEquals("Cannot divide by zero.", thrown.getMessage());
    }

    @Test
    void testAbsoluteValue() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.abs(5));
        assertEquals(5, calc.abs(-5));
        assertEquals(0, calc.abs(0));
    }
}