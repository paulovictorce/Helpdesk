package com.pauloprojects.Helpdesk.repositories;

import com.pauloprojects.Helpdesk.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
