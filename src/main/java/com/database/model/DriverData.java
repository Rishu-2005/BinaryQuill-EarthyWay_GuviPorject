package com.database.model;

import java.util.Objects;

public class DriverData {
    private int driverId;
    private int userId;
    private String vehicle_type;
    private String vehicle_model;
    private String vehicle_year;
    private String vehicle_fuel;
    private String reg_num;
    private String driv_license;

    public DriverData(int driverId, int userId, String vehicle_type, String vehicle_model, String vehicle_year, String vehicle_fuel, String reg_num, String driv_license) {
        this.driverId = driverId;
        this.userId = userId;
        this.vehicle_type = vehicle_type;
        this.vehicle_model = vehicle_model;
        this.vehicle_year = vehicle_year;
        this.vehicle_fuel = vehicle_fuel;
        this.reg_num = reg_num;
        this.driv_license = driv_license;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public String getVehicle_model() {
        return vehicle_model;
    }

    public void setVehicle_model(String vehicle_model) {
        this.vehicle_model = vehicle_model;
    }

    public String getVehicle_year() {
        return vehicle_year;
    }

    public void setVehicle_year(String vehicle_year) {
        this.vehicle_year = vehicle_year;
    }

    public String getVehicle_fuel() {
        return vehicle_fuel;
    }

    public void setVehicle_fuel(String vehicle_fuel) {
        this.vehicle_fuel = vehicle_fuel;
    }

    public String getReg_num() {
        return reg_num;
    }

    public void setReg_num(String reg_num) {
        this.reg_num = reg_num;
    }

    public String getDriv_license() {
        return driv_license;
    }

    public void setDriv_license(String driv_license) {
        this.driv_license = driv_license;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverData that = (DriverData) o;
        return driverId == that.driverId && userId == that.userId && Objects.equals(vehicle_type, that.vehicle_type) && Objects.equals(vehicle_model, that.vehicle_model) && Objects.equals(vehicle_year, that.vehicle_year) && Objects.equals(vehicle_fuel, that.vehicle_fuel) && Objects.equals(reg_num, that.reg_num) && Objects.equals(driv_license, that.driv_license);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverId, userId, vehicle_type, vehicle_model, vehicle_year, vehicle_fuel, reg_num, driv_license);
    }

    @Override
    public String toString() {
        return "DriverData{" +
                "driverId=" + driverId +
                ", userId=" + userId +
                ", vehicle_type='" + vehicle_type + '\'' +
                ", vehicle_model='" + vehicle_model + '\'' +
                ", vehicle_year='" + vehicle_year + '\'' +
                ", vehicle_fuel='" + vehicle_fuel + '\'' +
                ", reg_num='" + reg_num + '\'' +
                ", driv_license='" + driv_license + '\'' +
                '}';
    }
}
