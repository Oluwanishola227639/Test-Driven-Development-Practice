package com.semicolon.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
class AccountTest {
private Account account = new Account();

    @BeforeEach
    void setUp() {
//     account = new Account();
        System.out.println("start with this !");
    }

    @AfterEach
    void tearDown() {
        account = null;
        System.out.println("ends with this ! ");
    }

    @Test
    void testDepositAndBalance(){

        //Account account = new Account();

        account.deposit(50.50);
        double balance = account.getBalance();
        System.out.println(balance);
        assertEquals(50.50, balance);

        account.deposit(25.00);
        balance = account.getBalance();
        System.out.println(balance);
        assertEquals(75.50, balance);

        account.deposit(25.15);
        balance = account.getBalance();
        System.out.println(balance);
        assertEquals(100.65, balance);


        account.deposit(900);
        balance = account.getBalance();
        System.out.println(balance);
        assertEquals(1000.65, balance);

        System.out.println("test 1 running");
    }

    @Test
    void testNegativeDepositAndBalance(){
//        Account account = new Account();

        account.deposit(45);
        account.deposit(-45);
        double balance = account.getBalance();
        System.out.println(balance);
        assertEquals(45, balance);

        account.deposit(1100);
        account.deposit(-45);
        balance = account.getBalance();
        System.out.println(balance);
        assertEquals(1145, balance);

        account.deposit(100);
        account.deposit(-45);
        balance = account.getBalance();
        assertEquals(1245, balance);
        System.out.println(balance);
        System.out.println("test 2 running");

    }

    @Test
    void testWithdrawalAndBalance(){
        account.deposit(50.50);
        double balance = account.getBalance();
        System.out.println(balance);
        assertEquals(50.50, balance);

        account.withdraw(40);
        balance = account.getBalance();
        System.out.println(balance);
        assertEquals(10.50, balance);
    }
}