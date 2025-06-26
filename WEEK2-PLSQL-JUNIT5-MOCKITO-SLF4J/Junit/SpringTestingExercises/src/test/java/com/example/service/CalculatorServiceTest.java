package com.example.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorServiceTest {

    @Test
    void testAdd() {
        CalculatorService calculatorService = new CalculatorService();
        assertEquals(5, calculatorService.add(2, 3));
    }

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3",
        "10, 5, 15",
        "-1, -1, -2"
    })
    void testAddMultiple(int a, int b, int expected) {
        CalculatorService calculatorService = new CalculatorService();
        assertEquals(expected, calculatorService.add(a, b));
    }
}