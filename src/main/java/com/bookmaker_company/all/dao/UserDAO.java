package com.bookmaker_company.all.dao;

import com.bookmaker_company.all.model.User;

public interface UserDAO extends DAO {
    User getByUsername(String username);
}
