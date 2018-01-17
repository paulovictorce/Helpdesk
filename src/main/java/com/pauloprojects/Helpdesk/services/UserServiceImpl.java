package com.pauloprojects.Helpdesk.services;

import com.pauloprojects.Helpdesk.models.User;
import com.pauloprojects.Helpdesk.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User create(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean edit(Long id, User user) {
        return false;
    }
}
