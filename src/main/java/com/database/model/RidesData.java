package com.database.model;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.Objects;

public class RidesData {
    private int rideId;
    private int driverId;
    private int riderid;
    private String pickupLocation;
    private String dropOffLocation;
    private Timestamp scheduledTime;
    private Timestamp startTime;
    private Timestamp endTime;
    private float distance;
    private float fare;
    private String status;
    private Timestamp createdOn;

    public RidesData(int driverId, int riderid, String pickupLocation, String dropOffLocation, Timestamp scheduledTime, Timestamp startTime, Timestamp endTime, float distance, float fare, String status) {
        this.driverId = driverId;
        this.riderid = riderid;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.scheduledTime = scheduledTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.distance = distance;
        this.fare = fare;
        this.status = status;
    }

    public RidesData(int rideId, int driverId, int riderid, String pickupLocation, String dropOffLocation, Timestamp scheduledTime, Timestamp startTime, Timestamp endTime, float distance, float fare, String status, Timestamp createdOn) {
        this.rideId = rideId;
        this.driverId = driverId;
        this.riderid = riderid;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.scheduledTime = scheduledTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.distance = distance;
        this.fare = fare;
        this.status = status;
        this.createdOn = createdOn;
    }

    public int getRideId() {
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getRiderid() {
        return riderid;
    }

    public void setRiderid(int riderid) {
        this.riderid = riderid;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public Timestamp getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Timestamp scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RidesData ridesData = (RidesData) o;
        return rideId == ridesData.rideId && driverId == ridesData.driverId && riderid == ridesData.riderid && Float.compare(distance, ridesData.distance) == 0 && Float.compare(fare, ridesData.fare) == 0 && Objects.equals(pickupLocation, ridesData.pickupLocation) && Objects.equals(dropOffLocation, ridesData.dropOffLocation) && Objects.equals(scheduledTime, ridesData.scheduledTime) && Objects.equals(startTime, ridesData.startTime) && Objects.equals(endTime, ridesData.endTime) && Objects.equals(status, ridesData.status) && Objects.equals(createdOn, ridesData.createdOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rideId, driverId, riderid, pickupLocation, dropOffLocation, scheduledTime, startTime, endTime, distance, fare, status, createdOn);
    }

    @Override
    public String toString() {
        return "RidesData{" +
                "rideId=" + rideId +
                ", driverId=" + driverId +
                ", riderid=" + riderid +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                ", scheduledTime=" + scheduledTime +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", distance=" + distance +
                ", fare=" + fare +
                ", status='" + status + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
