package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;

public class PerformanceTesterTest {

    @Test
    void testPerformTaskTimeout() {
        PerformanceTester pt = new PerformanceTester();
        assertTimeout(Duration.ofMillis(100), () -> pt.performTask());
    }
}