package com.pauloprojects.Helpdesk.services;

import com.pauloprojects.Helpdesk.models.Role;
import com.pauloprojects.Helpdesk.models.User;
import com.pauloprojects.Helpdesk.repositories.RolesRepository;
import com.pauloprojects.Helpdesk.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private RolesRepository roleRepository;

    public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder, RolesRepository roleRepository) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.roleRepository = roleRepository;
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public User create(User user) {
        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
        Role role = this.roleRepository.findByName("USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(role)));
        return this.userRepository.save(user);
    }

    @Override
    public boolean delete(Long id) {
        User user = findById(id);
        if(user != null) {
            this.userRepository.delete(user);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Long id, User user) {
        User userExists = findById(id);
        if (userExists != null) {
            userExists.setId(user.getId());
            userExists.setName(user.getName());
            userExists.setLastName(user.getLastName());
            userExists.setEmail(user.getEmail());
            userExists.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
            userExists.setActive(user.isActive());

            this.userRepository.save(userExists);

            return true;
        }
        return false;
    }

    @Override
    public boolean edit(Long id, User user) {
        return false;
    }

    @Override
    public User show(Long id) {
        return findById(id);
    }

    private User findById(Long id) {
        return this.userRepository.findOne(id);
    }
}
