package org.example;

public class InvoiceGenerator {

    private static final int COST_PER_KM = 10;
    private static final int COST_PER_MIN = 1;
    private static final int MIN_FARE = 5;
    // constants → fixed values

    public double calculateFare(double distance, int time) {

        double fare = distance * COST_PER_KM + time * COST_PER_MIN;
        // UC1 → base calculation

        return Math.max(fare, MIN_FARE);
    }

    public double calculateFare(Ride[] rides) {

        double totalFare = 0;
        // accumulator → store total

        for (Ride ride : rides) {
            totalFare += calculateFare(ride.distance, ride.time);
            // reuse UC1 → important concept
        }

        return totalFare;
    }

    public InvoiceSummary calculateFareSummary(Ride[] rides) {

        double totalFare = calculateFare(rides);
        // reuse UC2 method

        return new InvoiceSummary(rides.length, totalFare);
        // return object → UC3 main concept
    }
}