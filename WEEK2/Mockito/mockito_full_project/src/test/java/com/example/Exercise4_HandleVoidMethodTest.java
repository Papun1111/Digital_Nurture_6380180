package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class Exercise4_HandleVoidMethodTest {
    @Test
    public void testVoidMethod() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doNothing().when(mockApi).performAction();
        mockApi.performAction();
        verify(mockApi).performAction();
    }
}
