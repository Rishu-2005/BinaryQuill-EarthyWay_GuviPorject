//package com.database.dao;
//import com.database.model.AccountData;
//
//import java.sql.*;
//
//public class AccountDAO {
//
//    private static final String URL = "jdbc:mysql://127.0.0.1:3306/EarthyWay";
//    private static final String USER = "root";
//    private static final String PASSWORD = "";
//    
//    private final String query = "INSERT INTO User(firstname,midname,lastname,email,phone,dob,passwd) VALUES(?,?,?,?,?,?,?)";
//
//    
//    public AccountDAO() {
//    }
//
//
//    public boolean addUser(String firstname, String midname, String lastname, String email, long phone, Date dob,
//			String passwd) throws ClassNotFoundException {
//    	boolean isCreated = false;
//    	
//
//                
//        
//        try {
//        	Class .forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1, firstname);
//            preparedStatement.setString(2, midname);
//            preparedStatement.setString(3, lastname);
//            preparedStatement.setString(4, email);
//            preparedStatement.setLong(5, phone);
//            preparedStatement.setDate(6, dob);
//            preparedStatement.setString(7, passwd);
//            int rowsAffected = preparedStatement.executeUpdate(); 
//            if (rowsAffected > 0) { 
//            	isCreated = true; 
//            	}
//        } catch (SQLException e) {
//            System.out.println("Cant add " + e.getMessage());
//        }
//        return isCreated;
//    }
//
//    public AccountData getUserbyid(int id) {
//        String query = "SELECT * FROM User WHERE accountid=?";
//        try (
//                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
//                PreparedStatement preparedStatement = connection.prepareStatement(query)
//        ) {
//            preparedStatement.setInt(1, id);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            if (resultSet.next()) {
//                resultSet.getInt("accountid");
//                resultSet.getString("firstname");
//                resultSet.getString("midname");
//                resultSet.getString("lastname");
//                resultSet.getString("email");
//                resultSet.getString("phone");
//                resultSet.getString("dob");
//            }
//        } catch (SQLException e) {
//            System.out.println("Cant get " + e.getMessage());
//        }
//        return null;
//    }
//
//    public void deleteUser(AccountData user) {
//
//        String query = "DELETE FROM User WHERE accountid=?";
//        try {
//            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setInt(1, user.getAccountId());
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println("Cant Delete" + e.getMessage());
//        }
//    }
//
//}




package com.database.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountDAO {

    private String jdbcURL = "jdbc:mysql://localhost:3306/your_database_name";
    private String jdbcUsername = "db_user";
    private String jdbcPassword = "db_password";

    private static final String INSERT_USER_SQL = "INSERT INTO users (firstname, midname, lastname, email, phone, dob, passwd) VALUES (?, ?, ?, ?, ?, ?, ?)";

    public AccountDAO() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public boolean createUser(String firstname, String midname, String lastname, String email, long phone, java.sql.Date dob, String passwd) {
        boolean isCreated = false;

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL)) {
            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, midname);
            preparedStatement.setString(3, lastname);
            preparedStatement.setString(4, email);
            preparedStatement.setLong(5, phone);
            preparedStatement.setDate(6, dob);
            preparedStatement.setString(7, passwd);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                isCreated = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isCreated;
    }
}
