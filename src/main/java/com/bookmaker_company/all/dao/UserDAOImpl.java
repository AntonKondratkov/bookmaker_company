package com.bookmaker_company.all.dao;

import com.bookmaker_company.all.model.Contact;
import com.bookmaker_company.all.model.User;
import com.bookmaker_company.all.dbconnect.ConnectionManager;
import com.sun.jndi.cosnaming.IiopUrl;
import org.springframework.web.bind.annotation.PathVariable;

//import javax.swing.tree.RowMapper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import javax.annotation.Resource;

public class UserDAOImpl implements UserDAO {

    public static void main(String[] args) {
        UserDAOImpl userDAO = new UserDAOImpl();
        System.out.println(userDAO.getAll());
    }
    @Override
    public Contact getByUsername(String username) {
        return null;
    }
    private Contact setUserPropertiesFromResultSet(ResultSet resultSet, Connection connection) throws SQLException {
        Contact contact = new Contact();
        contact.setUserName(resultSet.getString(2));
        contact.setPosition(resultSet.getString(3));
        contact.setInternalPhone(resultSet.getString(4));
        contact.setMobilePhone(resultSet.getString(5));
        contact.setEmail(resultSet.getString(6));

        return contact;
    }
    @Override
    public List<Contact> getAll() {
        List<Contact> contacts = new ArrayList<>();
        try (Connection connection = ConnectionManager.getInstance().getConnection()) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.GET_ALL_CONTACTS)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        contacts.add(setUserPropertiesFromResultSet(resultSet, connection));
                    }
                }
            } catch (SQLException e1) {
            e1.printStackTrace();
        }
    } catch (SQLException e) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
        return contacts;
    }

    @Override
    public boolean authentication(String name) {
        boolean result = false;
        List<Contact> contacts = getAll();
        for (Contact contact: contacts) {
            if(contact.getUserName().equals(name)) {
                result = true;
            }
        }
        return result;
    }


    @Override
    public Object getById(UUID id) {

        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public void create(Object o) {

    }

    @Override
    public void update(Object o) {

    }

}
