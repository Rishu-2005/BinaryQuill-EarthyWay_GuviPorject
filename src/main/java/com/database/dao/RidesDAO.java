package com.database.dao;

import com.database.model.RidesData;

import java.sql.*;

public class RidesDAO{
    private static final String URL= "jdbc:mysql://localhost:3306/EarthyWay";
    private static final String USER = "root";
    private static final String PASSWORD = "rishu005";

    public void addrider(RidesData rides) {

        String query = "INSERT INTO Rides(pickup_location, dropoff_location, scheduled_time, actual_start_time, actual_end_time, distance, fare, status) VALUES(?,?,?,?,?,?,?,?);";
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());

        try(
                Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ){
            preparedStatement.setString(1,rides.getPickupLocation());
            preparedStatement.setString(2,rides.getDropOffLocation());
            preparedStatement.setTimestamp(3,rides.getScheduledTime());
            preparedStatement.setTimestamp(4,rides.getStartTime());
            preparedStatement.setTimestamp(5,rides.getEndTime());
            preparedStatement.setDouble(6,rides.getDistance());
            preparedStatement.setDouble(7,rides.getFare());
            preparedStatement.setString(8,rides.getStatus());

            preparedStatement.executeUpdate();

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public RidesData getrider(int rideId) {

        String query = "SELECT * FROM Rides WHERE ride_id = ?";

        try(
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ){
            preparedStatement.setInt(1,rideId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                resultSet.getInt("ride_id");
                resultSet.getInt("driver_id");
                resultSet.getInt("rider_id");
                resultSet.getString("pickup_location");
                resultSet.getString("dropoff_location");
                resultSet.getTimestamp("scheduled_time");
                resultSet.getTimestamp("actual_start_time");
                resultSet.getTimestamp("actual_end_time");
                resultSet.getDouble("distance");
                resultSet.getDouble("fare");
                resultSet.getString("status");
                resultSet.getTimestamp("created_at");
            }
        } catch (SQLException e) {
            System.out.println("Can't get"+e.getMessage());
        }
        return null;
    }

    public void deleteride(int rideId) {
        String query = "DELETE FROM Rides WHERE ride_id = ?;";

        try(
                Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ){
            preparedStatement.setInt(1,rideId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
