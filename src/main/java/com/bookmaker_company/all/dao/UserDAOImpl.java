//package com.bookmaker_company.all.dao;
//
//import com.bookmaker_company.all.model.User;
//import com.bookmaker_company.all.dbconnect.ConnectionManager;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class UserDAOImpl implements  UserDAO {
//    @Override
//    public User getByUsername(String username) {
//        return null;
//    }
//
//    @Override
//    public List<User> getAll() {
//        List<User> users = new ArrayList<>();
//        try (Connection connection = ConnectionManager.getInstance().getConnection()) {
//            try (PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.GET_ALL_USERS)) {
//                try (ResultSet resultSet = preparedStatement.executeQuery()) {
//                    while (resultSet.next()) {
//                        users.add(setUserPropertiesFromResultSet(resultSet, connection));
//                    }
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return users;
//    }
//
//    @Override
//    public Object getById(UUID id) {
//        return null;
//    }
//
//    @Override
//    public void delete(UUID id) {
//
//    }
//
//    @Override
//    public void create(Object o) {
//
//    }
//
//    @Override
//    public void update(Object o) {
//
//    }
//}
