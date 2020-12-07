package com.semicolon.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array_TotalTest {
Array_Total newArray;
    @BeforeEach
    void setUp() {
        newArray = new Array_Total();
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void TestArraySummation(){
int[] array = {1,2,3,4,1};
double result = newArray.total(array);
assertEquals(11, result);
    }


    @Test
    void TestArrayAverage(){
        int[] array = {3,6,1,3};
        double result = newArray.average(array);
        assertEquals(3.25, result);
    }


    @Test
    void TestArrayMaximum(){
        int[] array = {3,6,1,3};
        double result = newArray.maximum(array);
        assertEquals(6, result);
    }


    @Test
    void TestArrayMinimum(){
        int[] array = {3,6,1,3};
        double result = newArray.minimum(array);
        assertEquals(1, result);
    }



    @Test
    void TestMaximumAdditionOfArray(){
        int [] array ={3,1,6,3};
        assertEquals(12,newArray.getMaxAddition(array));

    }

    @Test
    void TestMinimumAdditionOfArray(){
        int [] array ={3,1,6,3};
        assertEquals(7,newArray.getMinAddition(array));

    }

}