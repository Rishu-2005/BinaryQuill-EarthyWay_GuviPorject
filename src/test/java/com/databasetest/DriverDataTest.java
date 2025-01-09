package com.databasetest;

import com.database.model.DriverData;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DriverDataTest {

    @Test
    public void testDriverCreation() {
        DriverData driver = new DriverData(1, 1, "Car", "Toyota", "2020", "Petrol", "ABC123", "DL12345");
        assertNotNull(driver);
        assertEquals("Car", driver.getVehicle_type());
        assertEquals("Toyota", driver.getVehicle_model());
        System.out.print("Driver Creation Test executed Successfully -->");
        System.out.println("Driver Created Successfully.");
    }

    @Test
    public void testDriverLicenseUpdate() {
        DriverData driver = new DriverData(1, 1, "Car", "Toyota", "2020", "Petrol", "ABC123", "DL12345");
        driver.setDriv_license("NEWDL12345");
        assertEquals("NEWDL12345", driver.getDriv_license());
        System.out.print("Driver License Test executed Successfully -->");
        System.out.println("License Updated Successfully.");
    }

}
