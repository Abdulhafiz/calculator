package com.jenkins.calculator.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    @InjectMocks
    CalculatorService calculatorService = new CalculatorService();

    @Test
    void add() {

        BigDecimal actualResult = calculatorService.add(new BigDecimal(2), new BigDecimal(3));

        assertEquals(new BigDecimal(5), actualResult);
    }

    @Test
    void subtract() {
        BigDecimal actualResult = calculatorService.subtract(new BigDecimal(33), new BigDecimal(22));

        assertEquals(new BigDecimal(11), actualResult);
    }

    @Test
    void multiply() {
        BigDecimal actualResult = calculatorService.multiply(new BigDecimal(3), new BigDecimal(11));

        assertEquals(new BigDecimal(33), actualResult);
    }

    @Test
    void divide() {
        BigDecimal actualResult = calculatorService.divide(new BigDecimal(33), new BigDecimal(11));

        assertEquals(new BigDecimal(3), actualResult);
    }
}