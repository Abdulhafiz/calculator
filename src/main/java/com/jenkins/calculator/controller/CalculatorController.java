package com.jenkins.calculator.controller;

import com.jenkins.calculator.model.ApiResult;
import com.jenkins.calculator.service.CalculatorService;
import com.jenkins.calculator.model.ResultBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

import static com.jenkins.calculator.model.ResultBuilder.getResultFromError;

@RestController
@RequestMapping("/calculator/v1")
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;


    @GetMapping("/add")
    public ApiResult add(@RequestParam BigDecimal augend, @RequestParam BigDecimal addend ) {
        return  ResultBuilder.getResult(calculatorService.add(augend, addend));
    }

    @GetMapping("/subtract")
    public ApiResult subtract(@RequestParam BigDecimal minuent, @RequestParam BigDecimal subtrahend) {
        return  ResultBuilder.getResult(calculatorService.subtract(minuent, subtrahend));
    }

    @GetMapping("/multiply")
    public ApiResult multiply(@RequestParam BigDecimal multiplier, @RequestParam BigDecimal multiplicand) {
        return ResultBuilder.getResult(calculatorService.multiply(multiplier, multiplicand));
    }

    @GetMapping("/divide")
    public ApiResult divide(@RequestParam BigDecimal dividend, @RequestParam BigDecimal divisor) {
        if (divisor.equals(BigDecimal.ZERO)) {
            return getResultFromError("no division by null");
        }
        return ResultBuilder.getResult(calculatorService.divide(dividend, divisor));
    }

}
