package com.bookmaker_company.all.model;

import java.util.UUID;

public class User {
    private UUID id;
    private String userName;
    private String password;
    private Role role;
    private String fullName;
    private String email;
    private UserState state;
    private UUID cashBoxId;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public UUID getCashBoxId() {
        return cashBoxId;
    }

    public void setCashBoxId(UUID cashBoxId) {
        this.cashBoxId = cashBoxId;
    }
}
