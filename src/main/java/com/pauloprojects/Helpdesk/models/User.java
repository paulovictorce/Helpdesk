package com.pauloprojects.Helpdesk.models;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    @NotEmpty(message = "NAME can not be empty")
    private String name;

    @Column
    @NotEmpty(message = "LAST NAME can not be empty")
    private String lastName;

    @Column
    @NotEmpty(message = "EMAIL can not be empty")
    private String email;

    @Column
    @NotEmpty(message = "PASSWORD can not be empty")
    @Length(min = 5, message = "PASSWORD must contain at least 5 characters")
    private String password;

    @Column
    private boolean active;

    public User(){}

    public  User(String name, String lastName, String email, String password, Boolean active){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.active = active;
    }

    public  User(Long id, String name, String lastName, String email, String password, Boolean active){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
