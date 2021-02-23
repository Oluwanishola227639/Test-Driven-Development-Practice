package com.semicolon.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Date1Test {
    Date1 date1 = new Date1(00, 00, 0000);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDateDisplay() {

//        date.displayDate();
//
//
//        date.setDay(51);
//
//        date.setMonth(5);
//
//        date.setYear(2019);
//        System.out.println(date.displayDate());
//
//        assertEquals("0/0/0", date.displayDate());

        date1.toString();


        date1.setDay(51);

        date1.setMonth(5);

        date1.setYear(2019);
        System.out.println(date1.toString());

        assertEquals("0/0/0", date1.toString());


    }
}