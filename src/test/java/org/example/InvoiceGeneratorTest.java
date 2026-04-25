package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceServiceTest {

    @Test
    void givenUserId_shouldReturnInvoiceSummary() {

        InvoiceService service = new InvoiceService();

        Ride[] rides = {
                new Ride(2.0, 5),   // 25
                new Ride(3.0, 10)   // 40
        };

        service.addRides("user1", rides);
        // store rides for user

        InvoiceSummary summary = service.getInvoiceSummary("user1");
        // fetch invoice

        assertEquals(2, summary.getTotalRides());
        // verify rides count

        assertEquals(65, summary.getTotalFare());
        // verify total fare
    }
}