package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceGeneratorTest {

    @Test
    void givenMultipleRides_shouldReturnTotalFare() {

        InvoiceGenerator generator = new InvoiceGenerator();
        // create object

        Ride[] rides = {
                new Ride(2.0, 5),   // 25
                new Ride(3.0, 10)   // 40
        };

        double total = generator.calculateFare(rides);
        // call UC2 method

        assertEquals(65, total);
        // verify result
    }
}