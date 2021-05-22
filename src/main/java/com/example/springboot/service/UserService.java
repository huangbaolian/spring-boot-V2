package com.example.springboot.service;

import com.example.springboot.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> getUser(Integer id);

    void inserUser(User user);

    void updateUser(User user);

    void deleteUser(Integer id);
}
