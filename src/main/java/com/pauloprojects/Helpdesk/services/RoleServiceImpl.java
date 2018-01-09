package com.pauloprojects.Helpdesk.services;

import com.pauloprojects.Helpdesk.models.Role;
import com.pauloprojects.Helpdesk.repositories.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RolesRepository repository;

    public RoleServiceImpl(RolesRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Role> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Role create(Role role) {
        role.setName(role.getName().toUpperCase());
        Role roleCreated = this.repository.save(role);

        return roleCreated;
    }
}
