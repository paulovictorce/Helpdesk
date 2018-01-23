package com.pauloprojects.Helpdesk.services;

import com.pauloprojects.Helpdesk.models.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User create (User user);
    public boolean delete(Long id);
    public boolean update(Long id, User user);
    public boolean edit(Long id, User user);
    public User show(Long id);
}
