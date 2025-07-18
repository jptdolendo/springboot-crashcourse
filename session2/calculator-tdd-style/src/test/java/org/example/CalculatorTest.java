package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void seUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test correct sum for int data type")
    void testAddInt() {
        int numOne = 32;
        int numTwo = 16;
        int expected = 48;
        assertEquals(expected, calculator.add(numOne, numTwo));
    }

    @Test
    @DisplayName("Test incorrect sum for int data type")
    void testIncorrectAddInt() {
        int numOne = 32;
        int numTwo = 16;
        int expected = 50;
        assertNotEquals(expected, calculator.add(numOne, numTwo));
    }

    @Test
    @DisplayName("Test correct sum for long data type")
    void testAddLong() {
        long numOne = -100L;
        long numTwo = 100L;
        long expected = 0L;
        assertEquals(expected, calculator.add(numOne, numTwo));
    }

    @Test
    @DisplayName("Test incorrect sum for long data type")
    void testIncorrectAddLong() {
        long numOne = -100L;
        long numTwo = 100L;
        long expected = 50L;
        assertNotEquals(expected, calculator.add(numOne, numTwo));
    }

    @Test
    @DisplayName("Test correct sum for short data type")
    void testAddShort() {
        short numOne = 20;
        short numTwo = 10;
        short expected = 30;
        assertEquals(expected, calculator.add(numOne, numTwo));
    }

    @Test
    @DisplayName("Test incorrect sum for short data type")
    void testIncorrectAddShort() {
        short numOne = 20;
        short numTwo = 10;
        short expected = 50;
        assertNotEquals(expected, calculator.add(numOne, numTwo));
    }

    @Test
    @DisplayName("Test correct sum for float data type")
    void testAddFloat() {
        float numOne = 25.3f;
        float numTwo = 12.2f;
        float expected = 37.5f;
        assertEquals(expected, calculator.add(numOne, numTwo), 0.0001);
    }

    @Test
    @DisplayName("Test incorrect sum for float data type")
    void testIncorrectAddFloat() {
        float numOne = 25.3f;
        float numTwo = 12.2f;
        float expected = 40.25f;
        assertNotEquals(expected, calculator.add(numOne, numTwo), 0.0001);
    }

    @Test
    @DisplayName("Test correct sum for float data type")
    void testAddDouble() {
        double numOne = 7.77;
        double numTwo = 2.22;
        double expected = 9.99;
        assertEquals(expected, calculator.add(numOne, numTwo), 0.0001);
    }

    @Test
    @DisplayName("Test incorrect sum for float data type")
    void testIncorrectAddDouble() {
        double numOne = 7.77;
        double numTwo = 2.22;
        double expected = 7.12;
        assertNotEquals(expected, calculator.add(numOne, numTwo), 0.0001);
    }

    @Test
    @DisplayName("Test correct difference for int data type")
    void testSubtractInt() {
        int numOne = 32;
        int numTwo = 16;
        int expected = 16;
        assertEquals(expected, calculator.subtract(numOne, numTwo));
    }

    @Test
    @DisplayName("Test correct difference for long data type")
    void testSubtractLong() {
        long numOne = 500L;
        long numTwo = 200L;
        long expected = 300L;
        assertEquals(expected, calculator.subtract(numOne, numTwo));
    }

    @Test
    @DisplayName("Test correct difference for short data type")
    void testSubtractShort() {
        short numOne = 8;
        short numTwo = 8;
        short expected = 0;
        assertEquals(expected, calculator.subtract(numOne, numTwo));
    }

    @Test
    @DisplayName("Test correct difference for float data type")
    void testSubtractFloat() {
        float numOne = 8.50f;
        float numTwo = 3.25f;
        float expected = 5.25f;
        assertEquals(expected, calculator.subtract(numOne, numTwo), 0.0001);
    }

    @Test
    @DisplayName("Test correct difference for double data type")
    void testSubtractDouble() {
        double numOne = 8.50;
        double numTwo = 3.25;
        double expected = 5.25;
        assertEquals(expected, calculator.subtract(numOne, numTwo), 0.0001);
    }

    @Test
    @DisplayName("Test correct product for int data type")
    void testMultiplyInt() {
        int numOne = 25;
        int numTwo = 5;
        int expected = 125;
        assertEquals(expected, calculator.multiply(numOne, numTwo));
    }

    @Test
    @DisplayName("Test correct product for long data type")
    void testMultiplyLong() {
        long numOne = 25L;
        long numTwo = 10L;
        long expected = 250L;
        assertEquals(expected, calculator.multiply(numOne, numTwo));
    }

    @Test
    @DisplayName("Test correct product for short data type")
    void testMultiplyShort() {
        short numOne = 5;
        short numTwo = 2;
        short expected = 10;
        assertEquals(expected, calculator.multiply(numOne, numTwo));
    }

    @Test
    @DisplayName("Test correct product for float data type")
    void testMultiplyFloat() {
        float numOne = 30.0f;
        float numTwo = 3.0f;
        float expected = 90.0f;
        assertEquals(expected, calculator.multiply(numOne, numTwo), 0.0001);
    }

    @Test
    @DisplayName("Test correct product for double data type")
    void testMultiplyDouble() {
        double numOne = 10.5;
        double numTwo = 2.5;
        double expected = 26.25;
        assertEquals(expected, calculator.multiply(numOne, numTwo), 0.0001);
    }

    @Test
    @DisplayName("Test correct quotient for int data type")
    void testDivideInt() {
        int numOne = 10;
        int numTwo = 2;
        int expected = 5;
        assertEquals(expected, calculator.divide(numOne, numTwo));
    }

    @Test
    @DisplayName("Test correct quotient for long data type")
    void testDivideLong() {
        long numOne = 10L;
        long numTwo = 2L;
        long expected = 5L;
        assertEquals(expected, calculator.divide(numOne, numTwo));
    }

    @Test
    @DisplayName("Test correct quotient for short data type")
    void testDivideShort() {
        short numOne = 10;
        short numTwo = 5;
        short expected = 2;
        assertEquals(expected, calculator.divide(numOne, numTwo));
    }

    @Test
    @DisplayName("Test correct quotient for float data type")
    void testDivideFloat() {
        float numOne = 25.5f;
        float numTwo = 5.1f;
        float expected = 5.0f;
        assertEquals(expected, calculator.divide(numOne, numTwo), 0.0001);
    }

    @Test
    @DisplayName("Test correct quotient for double data type")
    void testDivideDouble() {
        double numOne = 50.5;
        double numTwo = 10.1;
        double expected = 5.0;
        assertEquals(expected, calculator.divide(numOne, numTwo), 0.0001);
    }
}
