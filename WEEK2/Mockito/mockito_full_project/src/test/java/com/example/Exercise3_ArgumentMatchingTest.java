package com.example;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;
import org.junit.jupiter.api.Test;

public class Exercise3_ArgumentMatchingTest {
    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = mock(ExternalApi.class);
        mockApi.processData("test-value");
        verify(mockApi).processData(eq("test-value"));
    }
}
