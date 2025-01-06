package com.database.model;


import java.sql.*;
import java.util.*;

public class AccountData {

    //Defining variables

    private int accountId;
    private String firstName;
    private String midName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private String dob;
    private Timestamp time;

    //Making Constructor


    public AccountData(String firstName, String midName, String lastName, String email, String password, String phone, String dob) {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.dob = dob;
    }

    public AccountData(int accountId, String firstName, String midName, String lastName, String email, String password, String phone, String dob) {
        this.accountId = accountId;
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.dob = dob;
    }


    //Getters and Setters

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    //equals and hash


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountData that = (AccountData) o;
        return accountId == that.accountId && phone == that.phone && Objects.equals(firstName, that.firstName) && Objects.equals(midName, that.midName) && Objects.equals(lastName, that.lastName) && Objects.equals(email, that.email) && Objects.equals(password, that.password) && Objects.equals(dob, that.dob) && Objects.equals(time, that.time);
    }


    @Override
    public int hashCode() {
        return Objects.hash(accountId, firstName, midName, lastName, email, password, phone, dob, time);
    }

    @Override
    public String toString() {
        return "AccountData{" +
                "accountId=" + accountId +
                ", firstName='" + firstName + '\'' +
                ", midName='" + midName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                ", dob=" + dob +
                ", time=" + time +
                '}';
    }
}
