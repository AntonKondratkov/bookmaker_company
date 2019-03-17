package com.bookmaker_company.all.service;

import com.bookmaker_company.all.model.User;

import java.util.List;

public interface UserService extends Service<User> {
    List<User> getAll();
}
