package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    void testA() {
        assertEquals(1, 1);
    }

    @Test
    @Order(2)
    void testB() {
        assertEquals(2, 2);
    }

    @Test
    @Order(3)
    void testC() {
        assertEquals(3, 3);
    }
}