package pro.sky.calculatorHw2._2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();

    @Test
    void plusNegative() {
        int actual = calculatorService.plus(-5, -5);
        Assertions.assertEquals(-10, actual);
    }

    @Test
    void plusPositive() {
        int actual = calculatorService.plus(5, 5);
        Assertions.assertEquals(10, actual);
    }

    @Test
    void minusNegative() {
        int actual = calculatorService.minus(-5, -5);
        Assertions.assertEquals(0, actual);
    }

    @Test
    void minusPositive() {
        int actual = calculatorService.minus(5, 5);
        Assertions.assertEquals(0, actual);
    }

    @Test
    void multiplyNegative() {
        int actual = calculatorService.multiply(-5, -5);
        Assertions.assertEquals(25, actual);
    }

    @Test
    void multiplyPositive() {
        int actual = calculatorService.multiply(5, 5);
        Assertions.assertEquals(25, actual);
    }

    @Test
    void divideNegative() throws Exception {
        int actual = calculatorService.divide(-5, -5);
        Assertions.assertEquals(1, actual);
    }

    @Test
    void dividePositive() throws Exception {
        int actual = calculatorService.divide(5, 5);
        Assertions.assertEquals(1, actual);
    }

    @Test
    void divisionByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                calculatorService.divide(5, 0));
    }
}