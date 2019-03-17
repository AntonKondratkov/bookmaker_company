package com.bookmaker_company.all.service;

import com.bookmaker_company.all.dao.UserDAO;
import com.bookmaker_company.all.model.User;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserDAO userDAO;

    @Override
    public List<User> getAll() {
        return null;
    }
}
