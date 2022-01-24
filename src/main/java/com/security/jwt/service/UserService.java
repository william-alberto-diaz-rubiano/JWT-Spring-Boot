package com.security.jwt.service;

import com.security.jwt.model.Role;
import com.security.jwt.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String userName,String roleName);
    User getUser(String userName);
    List<User> getUsers();
}
