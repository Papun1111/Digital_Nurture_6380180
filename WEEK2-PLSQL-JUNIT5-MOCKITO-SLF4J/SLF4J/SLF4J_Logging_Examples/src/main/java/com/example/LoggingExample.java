package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);
    public static void main(String[] args) {
    
        logger.error("This is an error message");
        logger.warn("This is a warning message");

     
        String username = "Papun Mohapatra";
        int loginAttempts = 3;
        logger.info("User {} has attempted to log in {} times", username, loginAttempts);
    }
}
