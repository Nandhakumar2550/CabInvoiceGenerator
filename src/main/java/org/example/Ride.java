package org.example;

public class Ride {

    public double distance;
    public int time;
    public RideCategory category;
    // new field → ride type

    public Ride(double distance, int time, RideCategory category) {
        this.distance = distance;
        this.time = time;
        this.category = category;
        // constructor → initialize ride with category
    }
}