package com.bookmaker_company.all.dbconnect;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DriverManagerDataSource;

public class ConnectionManager {
    private static ConnectionManager dataSource;
    private ComboPooledDataSource comboPooledDataSource;

    private ConnectionManager() {
        try {
            ResourceBundle resource = ResourceBundle.getBundle("database");
            comboPooledDataSource = new ComboPooledDataSource();
            comboPooledDataSource.setDriverClass(resource.getString("jdbc.driver"));
            comboPooledDataSource.setJdbcUrl(resource.getString("jdbc.url"));
            comboPooledDataSource.setUser(resource.getString("jdbc.user"));
            comboPooledDataSource.setPassword(resource.getString("jdbc.password"));
        } catch (PropertyVetoException ex1) {
            ex1.printStackTrace();
        }
    }

    public static ConnectionManager getInstance() {
        if (dataSource == null)
            dataSource = new ConnectionManager();
        return dataSource;
    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = comboPooledDataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
