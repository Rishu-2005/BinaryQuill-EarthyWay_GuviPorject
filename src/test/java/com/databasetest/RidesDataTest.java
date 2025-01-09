package com.databasetest;

import com.database.model.RidesData;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import java.sql.Timestamp;
import static org.junit.jupiter.api.Assertions.*;

public class RidesDataTest {

    @Test
    public void testRideCreation() {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        RidesData ride = new RidesData(1, 2, "Point A", "Point B", now, null, null, 15.5f, 300.0f, "Scheduled");
        assertNotNull(ride);
        assertEquals("Point A", ride.getPickupLocation());
        assertEquals(300.0f, ride.getFare());
        System.out.print("Ride Creation Test executed Successfully -->");
        System.out.println("Ride Created Successfully.");
    }

    @Test
    public void testRideCompletion() {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        Timestamp endTime = new Timestamp(System.currentTimeMillis() + 3600000); // 1 hour later
        RidesData ride = new RidesData(1, 2, "Point A", "Point B", now, now, endTime, 15.5f, 300.0f, "Completed");
        assertNotNull(ride.getEndTime());
        assertEquals("Completed", ride.getStatus());
        System.out.print("Ride Completion Test executed Successfully -->");
        System.out.println("Ride Completed Successfully.");
    }

    @Test
    public void testRideCancellation() {
        RidesData ride = new RidesData(1, 2, "Point A", "Point B", null, null, null, 0.0f, 0.0f, "Cancelled");
        assertEquals("Cancelled", ride.getStatus());
        System.out.print("Ride Cancellation Test executed Successfully -->");
        System.out.println("Ride Canceled Successfully.");
    }
    @AfterAll
    public static void afterAllTests() {
        System.out.println("*************************************");
        System.out.println("All Test cases executed successfully!");
    }
}
