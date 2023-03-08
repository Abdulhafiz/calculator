package com.jenkins.calculator.service;


import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

@Service
public class CalculatorService {

    public BigDecimal add(BigDecimal augend, BigDecimal addend) {
        return augend.add(addend);
    }

    public BigDecimal subtract(BigDecimal minuent, BigDecimal subtrahend) {
        return minuent.subtract(subtrahend);
    }

    public BigDecimal multiply(BigDecimal multiplier, BigDecimal multiplicand) {
        return multiplier.multiply(multiplicand);
    }

    public BigDecimal divide(BigDecimal dividend, BigDecimal divisor) {
        return dividend.divide(divisor, RoundingMode.HALF_EVEN);
    }
}
