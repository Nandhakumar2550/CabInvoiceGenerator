package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceGeneratorTest {

    @Test
    void givenRides_shouldReturnInvoiceSummary() {

        InvoiceGenerator generator = new InvoiceGenerator();

        Ride[] rides = {
                new Ride(2.0, 5),   // 25
                new Ride(3.0, 10)   // 40
        };

        InvoiceSummary summary = generator.calculateFareSummary(rides);
        // call UC3 method

        assertEquals(2, summary.getTotalRides());
        // verify total rides

        assertEquals(65, summary.getTotalFare());
        // verify total fare

        assertEquals(32.5, summary.getAverageFare());
        // verify average fare
    }
}