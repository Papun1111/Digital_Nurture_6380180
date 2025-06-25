package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdvancedCalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setup complete.");
    }

    @After
    public void tearDown() {
        calc = null;
        System.out.println("Teardown complete.");
    }

    @Test
    public void testAdditionUsingAAA() {
        int a = 10, b = 15;
        int result = calc.add(a, b);
        assertEquals(25, result);
    }

    @Test
    public void testSubtractionUsingAAA() {
        int a = 20, b = 5;
        int result = calc.subtract(a, b);
        assertEquals(15, result);
    }
}
