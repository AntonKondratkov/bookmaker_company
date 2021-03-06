package com.bookmaker_company.all.service;

import com.bookmaker_company.all.dao.UserDAO;
import com.bookmaker_company.all.dao.UserDAOImpl;
import com.bookmaker_company.all.model.User;


import java.util.List;

public class UserServiceImpl implements UserService{
    private UserDAO userDAO;

    public  UserServiceImpl(){
        this.userDAO = new UserDAOImpl();
    }

    @Override
    public List getAll() {
        return userDAO.getAll();
    }

    @Override
    public boolean authentication(String name) {
        return userDAO.authentication(name);
    }

}
