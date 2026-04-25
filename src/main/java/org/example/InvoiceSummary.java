package org.example;

public class InvoiceSummary {

    private int totalRides;
    // store total number of rides

    private double totalFare;
    // store total fare

    private double averageFare;
    // store average fare

    public InvoiceSummary(int totalRides, double totalFare) {

        this.totalRides = totalRides;
        this.totalFare = totalFare;

        this.averageFare = totalFare / totalRides;
        // calculate average → new concept
    }

    public int getTotalRides() {
        return totalRides;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public double getAverageFare() {
        return averageFare;
    }
}