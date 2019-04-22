package com.bookmaker_company.all.dao;

import com.bookmaker_company.all.model.Contact;
import com.bookmaker_company.all.model.User;

public interface UserDAO extends DAO {
    Contact getByUsername(String username);
    boolean authentication(String name);
}
