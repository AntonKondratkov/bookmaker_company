package com.bookmaker_company.all.dao;

import com.bookmaker_company.all.model.User;
import com.bookmaker_company.all.dbconnect.ConnectionManager;
import com.sun.jndi.cosnaming.IiopUrl;

//import javax.swing.tree.RowMapper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import javax.annotation.Resource;

public class UserDAOImpl implements  UserDAO {

    public static void main(String[] args) {
        UserDAOImpl userDAO = new UserDAOImpl();
        System.out.println(userDAO.getAll());
    }
    @Override
    public User getByUsername(String username) {
        return null;
    }
    private User setUserPropertiesFromResultSet(ResultSet resultSet, Connection connection) throws SQLException {
        User user = new User();
        user.setFullName(resultSet.getString(2));
        user.setPassword(resultSet.getString(3));
        return user;
    }
    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        try (Connection connection = ConnectionManager.getInstance().getConnection()) {
            try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user")) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        users.add(setUserPropertiesFromResultSet(resultSet, connection));
                    }
                }
            } catch (SQLException e1) {
            e1.printStackTrace();
        }
    } catch (SQLException e) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
        return users;
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
