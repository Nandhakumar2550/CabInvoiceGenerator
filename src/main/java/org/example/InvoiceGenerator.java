package org.example;

public class InvoiceGenerator {

    private static final int COST_PER_KM = 10;
    // constant → cost per km

    private static final int COST_PER_MIN = 1;
    // constant → cost per minute

    private static final int MIN_FARE = 5;
    // constant → minimum fare

    public double calculateFare(double distance, int time) {

        double fare = distance * COST_PER_KM + time * COST_PER_MIN;
        // UC1 → calculate fare

        return Math.max(fare, MIN_FARE);
        // ensure minimum fare
    }

    public double calculateFare(Ride[] rides) {

        double totalFare = 0;
        // accumulator → store total fare

        for (Ride ride : rides) {
            // loop → process each ride

            totalFare += calculateFare(ride.distance, ride.time);
            // method reuse → call UC1 method
        }

        return totalFare;
        // return final result
    }
}