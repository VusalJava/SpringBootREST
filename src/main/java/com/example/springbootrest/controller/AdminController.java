package com.example.springbootrest.controller;

import com.example.springbootrest.domain.User;
import com.example.springbootrest.service.RoleService;
import com.example.springbootrest.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/api")
public class AdminController {

    private final UserService userService;

    public AdminController(UserService userService){
        this.userService = userService;

    }

    @GetMapping("/users")
    public List<User> list(){
        return userService.readAllUsers();
    }

    @GetMapping("/users/{id}")
    public User showUser(@PathVariable("id") Long id) {
        return userService.getUserById(id);

    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        return userService.update(user);
    }

    @PostMapping("/users")
    public User newUser(@RequestBody User user){

        return userService.createUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Long id){
        userService.deleteById(id);
    }






}
