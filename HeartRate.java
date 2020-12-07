package com.semicolon.tdd;

    /*3.16 (Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see that
        your heart rate stays within a safe range suggested by your trainers and doctors. According to the Amer-
        ican Heart Association (AHA) ( www.americanheart.org/presenter.jhtml?identifier=4736 ), the
        formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years.
        Your target heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are
        estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness
        and gender of the individual. Always consult a physician or qualified health-care professional before
        beginning or modifying an exercise program.] Create a class called HeartRates . The class attributes
        should include the person’s first name, last name and date of birth (consisting of separate attributes for
        the month, day and year of birth). Your class should have a constructor that receives this data as pa-
        rameters. For each attribute provide set and get methods. The class also should include a method that
        calculates and returns the person’s age (in years), a method that calculates and returns the person’s
        maximum heart rate and a method that calculates and returns the person’s target heart rate. Write a
        Java app that prompts for the person’s information, instantiates an object of class HeartRates and
        prints the information from that object—including the person’s first name, last name and date of
        birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate
        range.*/


    public class HeartRate {
        private String firstName,lastName,dateOfBirth;
        int currentYear=2020;
        int YY, MM, DD;

        int Age;

        //constructor declaration
        public HeartRate (String firstName, String lastName, String dateOfBirth, int DD, int MM, int YY){
            this.firstName = firstName;
            this.lastName = lastName;
            this.dateOfBirth = dateOfBirth;
        }
        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public void setDateOfBirth(String dateOfBirth){
            this.dateOfBirth = dateOfBirth;
        }

        public String getFirstName(){
            return firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public String getDateOfBirth(){
            return dateOfBirth;
        }


        public int getAge() {

            return Age;
        }

        public void setAge(){

            this.Age= Age;
        }
    }


