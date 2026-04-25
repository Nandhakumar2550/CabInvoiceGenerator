package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceGeneratorTest {

    @Test
    void givenNormalRide_shouldReturnCorrectFare() {

        InvoiceGenerator generator = new InvoiceGenerator();

        Ride ride = new Ride(2.0, 5, RideCategory.NORMAL);

        double fare = generator.calculateFare(ride);

        assertEquals(25, fare);
        // 2*10 + 5*1
    }

    @Test
    void givenPremiumRide_shouldReturnCorrectFare() {

        InvoiceGenerator generator = new InvoiceGenerator();

        Ride ride = new Ride(2.0, 5, RideCategory.PREMIUM);

        double fare = generator.calculateFare(ride);

        assertEquals(40, fare);
        // 2*15 + 5*2 = 40
    }
}