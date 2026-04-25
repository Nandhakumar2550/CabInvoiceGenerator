package org.example;

import java.util.HashMap;
import java.util.Map;

public class InvoiceService {

    private Map<String, Ride[]> userRides = new HashMap<>();
    // Map → store userId → rides (UC4)

    public void addRides(String userId, Ride[] rides) {

        userRides.put(userId, rides);
        // put() → store rides for user
    }

    public InvoiceSummary getInvoiceSummary(String userId) {

        Ride[] rides = userRides.get(userId);
        // get() → retrieve rides using userId

        InvoiceGenerator generator = new InvoiceGenerator();
        // create object

        return generator.calculateFareSummary(rides);
        // return summary →  UC3
    }
}