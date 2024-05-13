package com.example.demo.service.impl;

import com.example.demo.entity.Roles;
import com.example.demo.repository.RolesRepository;
import com.example.demo.service.RolesService;

import java.util.List;
import java.util.Optional;

public class RolesServiceImpl implements RolesService {
    private final RolesRepository rolesRepository;


    @Override
    public Optional<Roles> getRoleById(Integer id) {
        return rolesRepository.findById(id);
    }

    @Override
    public List<Roles> getAllRoles() {
        return rolesRepository.findAll();
    }

    @Override
    public void saveRole(Roles roles) {
        rolesRepository.save(roles);
    }

    @Override
    public void deleteRoleById(Integer id) {
        rolesRepository.deleteById(id);
    }
}
