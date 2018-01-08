package com.pauloprojects.Helpdesk.repositories;

import com.pauloprojects.Helpdesk.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Role, Long> {
}
