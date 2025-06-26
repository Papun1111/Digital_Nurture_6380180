package com.example;

public interface ExternalApi {
    String getData();
    void performAction();
    void initialize();
    void cleanup();
    void processData(String input);
}
