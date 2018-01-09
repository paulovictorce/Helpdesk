package com.pauloprojects.Helpdesk.services;

import com.pauloprojects.Helpdesk.models.Role;

import java.util.List;

public interface RoleService {

    public List<Role> findAll();
    public Role create (Role role);
}
