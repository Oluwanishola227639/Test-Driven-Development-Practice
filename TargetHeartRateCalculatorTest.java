package com.semicolon.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetHeartRateCalculatorTest {

    TargetHeartRateCalculator heartRateCalculator;
    private Object TargetHeartRateCalculator;

    @BeforeEach
    void setUp() {
        heartRateCalculator= new TargetHeartRateCalculator("shola", "oretan", 0, 0, 0000);
    }

    @AfterEach
    void tearDown() {
        heartRateCalculator= null;
    }


    @Test
    void testToGeneratecontructor(){


        System.out.println(heartRateCalculator.getDateOfBirth());
        heartRateCalculator.setDay(14);
        heartRateCalculator.setMonth(01);
        heartRateCalculator.setYear(2019);
        System.out.println("First Name: "+ heartRateCalculator.getFirstName());
        System.out.println("Last Name: "+ heartRateCalculator.getLastName());
        System.out.println("Date Of Birth: "+ heartRateCalculator.getDateOfBirth());
        System.out.println("Age: "+ heartRateCalculator.getAge());
        System.out.println("Maximum Heart Rate :"+ heartRateCalculator.getMaximumHeartRate()+" beats/min");
        System.out.println("Target Heart Rate :"+ heartRateCalculator.getTargetHeartRate());



       assertEquals(1,heartRateCalculator.getAge());
       assertEquals(219,heartRateCalculator.getMaximumHeartRate());
       assertEquals(-76.65,heartRateCalculator.getTargetHeartRate());

    }



}