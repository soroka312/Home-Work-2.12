package pro.sky.calculatorHw2._2.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя");
        }
        return a / b;
    }

}
