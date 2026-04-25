package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceGeneratorTest {

    @Test
    void givenDistanceAndTime_shouldReturnTotalFare() {

        InvoiceGenerator generator = new InvoiceGenerator();
        // create object

        double fare = generator.calculateFare(2.0, 5);
        // input values

        assertEquals(25, fare);
        // 2*10 + 5*1 = 25
    }

    @Test
    void givenLessDistance_shouldReturnMinimumFare() {

        InvoiceGenerator generator = new InvoiceGenerator();

        double fare = generator.calculateFare(0.1, 1);
        // very small input

        assertEquals(5, fare);
        // minimum fare applied
    }
}