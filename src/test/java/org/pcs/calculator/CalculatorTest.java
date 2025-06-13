package org.pcs.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    Calculator calculator = new Calculator();

    int a,b;

    @BeforeEach
    void setUp() {
        a = 5;
        b = 5;
    }

    @Test
    void testAdd() {
        int result = calculator.add(a, b);
        assertEquals(10, result);
    }

    @Test
    void testSub(){
        int result = calculator.sub(a, b);
        assertEquals(0, result);
    }

    @Test
    void testMultiply(){
        int result = calculator.multiply(a, b);
        assertEquals(25, result);
    }

    @Test
    void testDivision(){
        int result = calculator.division(a, b);
        assertEquals(1, result);
    }

    @Test
    void testDivideByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.division(5, 0);
        });
        assertEquals("/ by zero", exception.getMessage());
    }

}