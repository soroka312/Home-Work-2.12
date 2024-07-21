package pro.sky.calculatorHw2._2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CalculatorServiceParameterizedTest {
    CalculatorService calculatorService = new CalculatorService();

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(12, 43),
                Arguments.of(18, -93),
                Arguments.of(82, 40),
                Arguments.of(-92, 73),
                Arguments.of(12, -43),
                Arguments.of(16, 83)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void plus(int a, int b) {
        int actual = calculatorService.plus(a, b);
        int expected = a + b;
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("data")
    void minus(int a, int b) {
        int actual = calculatorService.minus(a, b);
        int expected = a - b;
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("data")
    void divide(int a, int b) {
        int actual = calculatorService.divide(a, b);
        int expected = a / b;
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("data")
    void multiply(int a, int b) {
        int actual = calculatorService.multiply(a, b);
        int expected = a * b;
        Assertions.assertEquals(expected, actual);
    }

}