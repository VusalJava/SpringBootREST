package com.example.springbootrest.service;


import com.example.springbootrest.domain.User;
import java.util.List;

public interface UserService {

    //create user
    User createUser(User user);

    //read users
    List<User> readAllUsers();

    User getUserById(Long id);

    User getUserByLogin(String login);

    //delete user
    void deleteById(Long id);

    //update user
    User update(User user);

}
