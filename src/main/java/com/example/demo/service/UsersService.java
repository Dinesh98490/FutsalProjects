package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UsersService {
    User getUserById(Integer id);
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUserById(Integer id);
}
