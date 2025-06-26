package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FileServiceTest {
    @Test
    public void testServiceWithMockFileIO() {
        MyFileReader mockFileReader = mock(MyFileReader.class);
        MyFileWriter mockFileWriter = mock(MyFileWriter.class);
        when(mockFileReader.read()).thenReturn("Mock File Content");
        FileService fileService = new FileService(mockFileReader, mockFileWriter);
        String result = fileService.processFile();
        assertEquals("Processed Mock File Content", result);
    }
}
