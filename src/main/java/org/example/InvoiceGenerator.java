package org.example;

public class InvoiceGenerator {

    public double calculateFare(Ride ride) {

        double costPerKm;
        double costPerMin;
        double minFare;
        // dynamic pricing

        if (ride.category == RideCategory.PREMIUM) {
            costPerKm = 15;
            costPerMin = 2;
            minFare = 20;
        } else {
            costPerKm = 10;
            costPerMin = 1;
            minFare = 5;
        }

        double fare = ride.distance * costPerKm + ride.time * costPerMin;

        return Math.max(fare, minFare);
        // apply minimum fare
    }

    public double calculateFare(Ride[] rides) {

        double totalFare = 0;
        // accumulator

        for (Ride ride : rides) {
            totalFare += calculateFare(ride);
            // reuse method
        }

        return totalFare;
    }

    public InvoiceSummary calculateFareSummary(Ride[] rides) {

        double totalFare = calculateFare(rides);
        // reuse UC2 logic

        return new InvoiceSummary(rides.length, totalFare);
        // return summary → UC3
    }
}