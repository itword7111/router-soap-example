package com.example.command_web_service.persist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private final int defaultValue = Integer.MAX_VALUE;
    private static Connection connection;
    private PreparedStatement preparedStatement;

    static {

    }

    public void insert(String user_name, String group_id, String role_id) {

    }

    public void update(String user_name, String group_id, String role_id) {

    }

    public void delete(String user_name) {

    }

    public List<String> getUsersNamesByRoles(String role) {
        List<String> usersNamesList = new ArrayList<>();

        return usersNamesList;
    }

    private int getGroupId(String group) throws SQLException {

        return 1;
    }

    private int getRoleId(String role) throws SQLException {

        return 1;
    }
}
