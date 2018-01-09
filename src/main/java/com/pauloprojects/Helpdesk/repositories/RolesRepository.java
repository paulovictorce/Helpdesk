package com.pauloprojects.Helpdesk.repositories;

import com.pauloprojects.Helpdesk.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Role, Long> {
}
