package edu.unac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
  void  sum() {
    Calculator calculator = new Calculator();
    int result = calculator.add(1, 2);
    assertEquals(3, result);
  }

  @Test
  void  subtract() {
    Calculator calculator = new Calculator();
    int result = calculator.subtract(1, 2);
    assertEquals(-1, result);
  }

  @Test
  void  multiply() {
    Calculator calculator = new Calculator();
    int result = calculator.multiply(1, 2);
    assertEquals(2, result);
  }
}