package com.semicolon.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateTest {

HeartRate heartRatePerson1 =  new HeartRate("john", "paul", "20/01",01, 3, 1996);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }



    @Test
    void TestGetAge(){

    int age = heartRatePerson1.getAge();
        System.out.println(age);
        assertEquals(24,age);



    }
}