package com.example.springbootrest.controller;

import com.example.springbootrest.domain.User;
import com.example.springbootrest.repository.RoleRepository;
import com.example.springbootrest.service.RoleService;
import com.example.springbootrest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    private final UserService userService;
    private final RoleService roleService;

    @Autowired
    public UserController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }


    @GetMapping("/user")
    public String showUser(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("user",user);
        return "user-panel";

    }
    @GetMapping("/admin")
    public String showAdmin(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("user",user);
        model.addAttribute("roles",roleService.readAllRoles());
        return "admin-page";

    }


}