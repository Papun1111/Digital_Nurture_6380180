package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class Exercise6_VerifyInteractionOrderTest {
    @Test
    public void testOrderOfCalls() {
        ExternalApi mockApi = mock(ExternalApi.class);
        mockApi.initialize();
        mockApi.getData();
        mockApi.cleanup();

        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).initialize();
        inOrder.verify(mockApi).getData();
        inOrder.verify(mockApi).cleanup();
    }
}
