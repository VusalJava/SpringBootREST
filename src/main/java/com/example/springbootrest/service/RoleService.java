package com.example.springbootrest.service;


import com.example.springbootrest.domain.Role;

import java.util.List;

public interface RoleService {
    //read roles
    List<Role> readAllRoles();

    Role findRoleById(Long id);
}
