package com.semicolon.tdd;

public class ChapterFiveExercises {
    private long result=1;
    int counter = 1;
    int input;

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }

    public void generateFactorial(int input) {

        while(input > 1){
            result =result *input;
            input = input - 1;
        }



        while (counter <= input) {
            result = result * counter;
            counter++;
        }
        this.result = result;
    }

    public void generateOddNumberProducts(int input) {
        while(counter >0 && counter < 15){
            counter +=2;
            this.result = result * counter;
        }
    }
}


