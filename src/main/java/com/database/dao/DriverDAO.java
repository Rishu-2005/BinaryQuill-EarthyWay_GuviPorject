package com.database.dao;

import com.database.model.DriverData;

import java.sql.*;

public class DriverDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/?user=root";
    private static final String USER = "root";
    private static final String PASSWORD = "sumit1012397";


    public void addDriver(DriverData driver) {
        String query = "INSERT INTO Driver_Details(user_id,vehicle_type, vehicle_fuel, vehicle_model, vehicle_year, rc_no, driver_license) VALUES (?,?,?,?,?,?,?)";
        try (
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setInt(1, driver.getUserId());
            preparedStatement.setString(2, driver.getVehicle_type());
            preparedStatement.setString(3, driver.getVehicle_fuel());
            preparedStatement.setString(4, driver.getVehicle_model());
            preparedStatement.setString(5, driver.getVehicle_year());
            preparedStatement.setString(6, driver.getReg_num());
            preparedStatement.setString(7, driver.getDriv_license());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Can't add " + e.getMessage());
        }
    }

    public DriverData getDriver(int driverId) {
        String query = "SELECT * FROM Driver_Details WHERE driver_id=?";
        try (
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setInt(1, driverId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                resultSet.getInt("driver_id");
                resultSet.getInt("user_id");
                resultSet.getString("vehicle_type");
                resultSet.getString("vehicle_fuel");
                resultSet.getString("vehicle_model");
                resultSet.getString("vehicle_year");
                resultSet.getString("rc_no");
                resultSet.getString("driver_license");
            }
        } catch (SQLException e) {
            System.out.println("Can't get driver " + e.getMessage());
        }
        return null;
    }

    public void deleteDriver(DriverData driver) {
        String query = "DELETE FROM Driver_Details WHERE driver_id=?";
        try (
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setInt(1, driver.getDriverId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Can't delete driver " + e.getMessage());
        }
    }
}

