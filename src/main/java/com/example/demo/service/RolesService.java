package com.example.demo.service;

import com.example.demo.entity.Roles;

import java.util.List;
import java.util.Optional;

public interface RolesService {
    Optional<Roles> getRoleById(Integer id);
    List<Roles> getAllRoles();
    void saveRole(Roles roles);
    void deleteRoleById(Integer id);
}
