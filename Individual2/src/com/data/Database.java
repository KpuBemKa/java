package com.data;

import com.logic.User;

import java.sql.*;
import java.util.ArrayList;

public class Database {
    public static Connection connection = null;
    private static String CONN_STRING = "jdbc:mysql://localhost:3306/ceiti";
    private static String USERNAME = "root";
    private static String PASSWORD = "";
    private static String GET_USERS_SQL = "SELECT * FROM `users`;";
    private static String INSERT_USER_SQL = "INSERT INTO `users`(`username`, `password`, `name`, `surname`, `mobile_number`, `email`) VALUES (?, ?, ?, ?, ?, ?);";
    private static String UPDATE_USER_SQL = "UPDATE `users` SET `#`=? WHERE id=?;";
    private static String DELETE_USER_SQL = "DELETE FROM `users` WHERE id=?;";

    public static void connect() {
        if (connection != null)
            return;
        else {
            try {
                connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static ArrayList<User> getAllUsers() {
        connect();
        ArrayList<User> users = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement(GET_USERS_SQL);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                users.add(new User(
                        resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("mobile_number"),
                        resultSet.getString("email")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public static boolean newUser(String username, String password, String name, String surname, String mobileNumber, String email) {
        connect();

        try {
            PreparedStatement statement = connection.prepareStatement(INSERT_USER_SQL);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setString(3, name);
            statement.setString(4, surname);
            statement.setString(5, mobileNumber);
            statement.setString(6, email);

            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public static boolean updateUser(Integer id, Field field, String fieldValue) {
        connect();

        String UPDATE_STATEMENT;

        try {
            switch (field) {
                case USERNAME -> UPDATE_STATEMENT = UPDATE_USER_SQL.replace("#", "username");
                case PASSWORD -> UPDATE_STATEMENT = UPDATE_USER_SQL.replace("#", "password");
                case NAME -> UPDATE_STATEMENT = UPDATE_USER_SQL.replace("#", "name");
                case SURNAME -> UPDATE_STATEMENT = UPDATE_USER_SQL.replace("#", "surname");
                case MOBILE_NUMBER -> UPDATE_STATEMENT = UPDATE_USER_SQL.replace("#", "mobile_number");
                case EMAIL -> UPDATE_STATEMENT = UPDATE_USER_SQL.replace("#", "email");
                default -> UPDATE_STATEMENT = "UPDATE `users` SET `#`=? WHERE id=?;";
            }
            PreparedStatement statement = connection.prepareStatement(UPDATE_STATEMENT);
            statement.setString(1, fieldValue);
            statement.setInt(2, id);

            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean deleteUser(Integer id){
        connect();

        try {
            PreparedStatement statement = connection.prepareStatement(DELETE_USER_SQL);

            statement.setInt(1, id);

            statement.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public enum Field {
        USERNAME,
        PASSWORD,
        NAME,
        SURNAME,
        MOBILE_NUMBER,
        EMAIL
    }
}
