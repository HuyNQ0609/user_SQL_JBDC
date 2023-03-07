package com.example.user_management.dao;

import com.example.user_management.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    void insertUser(User user) throws SQLException;

    User selectUser(int id);

    List<User> selectAllUsers();

    boolean deleteUser(int id) throws SQLException;

    boolean updateUser(User user) throws SQLException;

    void addUserTransaction(User user, int[] permission);

    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;
}
