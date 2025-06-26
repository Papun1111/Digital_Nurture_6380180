package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exercise5_MultipleReturnsTest {
    @Test
    public void testMultipleReturns() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("One", "Two", "Three");
        MyService service = new MyService(mockApi);
        assertEquals("One", service.fetchData());
        assertEquals("Two", service.fetchData());
        assertEquals("Three", service.fetchData());
    }
}
