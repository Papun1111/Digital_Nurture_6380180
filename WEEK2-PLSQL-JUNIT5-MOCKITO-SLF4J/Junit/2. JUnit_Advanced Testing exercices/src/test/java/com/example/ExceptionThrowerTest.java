package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionThrowerTest {

    @Test
    void testThrowException() {
        ExceptionThrower et = new ExceptionThrower();
        assertThrows(IllegalArgumentException.class, et::throwException);
    }
}