package com.example;

public class FileService {
    private MyFileReader fileReader;
    private MyFileWriter fileWriter;

    public FileService(MyFileReader fileReader, MyFileWriter fileWriter) {
        this.fileReader = fileReader;
        this.fileWriter = fileWriter;
    }

    public String processFile() {
        String content = fileReader.read();
        fileWriter.write("Processed " + content);
        return "Processed " + content;
    }
}
