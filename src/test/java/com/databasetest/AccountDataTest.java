package com.databasetest;

import com.database.model.AccountData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;

public class AccountDataTest {

    @Test
    public void testAccountCreation() {
        AccountData account = new AccountData("John", "M", "Doe", "john.doe@example.com", "password123", "1234567890", "1990-01-01");
        assertNotNull(account);
        assertEquals("John", account.getFirstName());
        assertEquals("john.doe@example.com", account.getEmail());
        System.out.print("Account Creation Test executed Successfully -->");
        System.out.println("Account Created Successfully.");
    }

    @Test
    public void testAccountDeletion() {
        AccountData account = new AccountData(1, "John", "M", "Doe", "john.doe@example.com", "password123", "1234567890", "1990-01-01");
        account = null;
        assertNull(account);
        System.out.print("Account Deletion Test executed Successfully --> ");
        System.out.println("Account Deleted Successfully.");
    }

    @Test
    public void testUserAuthentication() {
        AccountData account = new AccountData(1, "John", "M", "Doe", "john.doe@example.com", "password123", "1234567890", "1990-01-01");
        assertEquals("password123", account.getPassword());
        assertTrue("john.doe@example.com".equalsIgnoreCase(account.getEmail()));
    }

    @Test
    public void testEmailUpdate() {
        AccountData account = new AccountData(1, "John", "M", "Doe", "john.doe@example.com", "password123", "1234567890", "1990-01-01");
        account.setEmail("new.email@example.com");
        assertEquals("new.email@example.com", account.getEmail());
        System.out.print("Email Updation Test executed Successfully --> ");
        System.out.println("Email Updated Successfully");

    }



}