package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class Exercise7_VoidMethodExceptionTest {
    @Test
    public void testVoidMethodThrowsException() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doThrow(new RuntimeException("Simulated exception")).when(mockApi).performAction();

        try {
            mockApi.performAction();
        } catch (RuntimeException e) {
            assert(e.getMessage().equals("Simulated exception"));
        }

        verify(mockApi).performAction();
    }
}
