package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

public class TestMain {

    @Test
    void testIsEven() {
        Random rnd = new Random();
        int number = rnd.nextInt(100);
        boolean result = TestClassExp1.isEven(number);
        Assertions.assertTrue(result, "результат" + "\n" + result);
    }

    @Test
    void testIsPositive() {
        //Random rnd = new Random();
        //int number = rnd.nextInt(100);
        int number = 0;
        boolean result = TestClassExp1.isPositive(number);
        Assertions.assertTrue(result, "результат" + "\n" + result);

    }


    @Test
    void testCheckAccess() {
        Random rnd = new Random();
        int age = 5;
        String expected = "Allowed";
        String actual = TestClassExp1.checkAccess(age);

        Assertions.assertEquals(expected, actual, "ожидаемый рез-т " + expected + "\n" + "фактический рез-т" + "\n" + actual);

    }

    @Test
    void testRemoveSpecificName(){
        List<String> newlist = List.of("Monica", "Joy", "Ross", "Chandler", "Fibi");

        List<String> expected = List.of("Monica", "Joy", "Ross");
        List<String> actual = List.of( "Ross");
        Assertions.assertEquals(expected, actual, "ожидаемый рез-т " + expected + "\n" + "фактический рез-т" + "\n" + actual);


    }


}
