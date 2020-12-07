package com.semicolon.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ChapterFiveExercisesTest {
    ChapterFiveExercises exercise = new ChapterFiveExercises();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testMethodFactorialGeneration(){
        ChapterFiveExercises exercise = new ChapterFiveExercises();

        exercise.generateFactorial(5);
        long result = exercise.getResult();

        assertEquals(120,result);
    }


    @Test
    void testProductOfOddNumbers(){
        exercise.generateOddNumberProducts(15);
        long result = exercise.getResult();
        assertEquals(2027025, result);
    }

}