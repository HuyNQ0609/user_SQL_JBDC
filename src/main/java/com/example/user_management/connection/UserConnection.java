package com.example.user_management.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserConnection {
    private final String jdbcURL;
    private final String jdbcUsername;
    private final String jdbcPassword;

    {
        jdbcURL = "jdbc:mysql://localhost:3306/user_management?useSSL=false";
        jdbcUsername = "root";
        jdbcPassword = "Huynhitu12";
    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
}
