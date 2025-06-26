package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Test
    void testGetUserById() {
        UserRepository mockRepo = Mockito.mock(UserRepository.class);
        UserService userService = new UserService();
        User mockUser = new User(2L, "Alice");

        when(mockRepo.findById(2L)).thenReturn(Optional.of(mockUser));

        // Inject mock manually since field is private
        var field = UserService.class.getDeclaredFields()[0];
        field.setAccessible(true);
        try {
            field.set(userService, mockRepo);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        User result = userService.getUserById(2L);
        assertEquals("Alice", result.getName());
    }
}