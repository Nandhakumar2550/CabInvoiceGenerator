package org.example;

public class InvoiceGenerator {

    private static final int COST_PER_KM = 10;
    // constant → fixed cost per km

    private static final int COST_PER_MIN = 1;
    // constant → fixed cost per minute

    private static final int MIN_FARE = 5;
    // constant → minimum fare

    public double calculateFare(double distance, int time) {

        double fare = distance * COST_PER_KM + time * COST_PER_MIN;
        // core calculation

        return Math.max(fare, MIN_FARE);
        // ensure fare is not less than minimum
    }
}