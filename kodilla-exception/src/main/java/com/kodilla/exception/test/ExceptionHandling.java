package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(5.0,0.5);
        } catch (Exception e) {
            System.out.println("Problem with your chosen numbers");
        } finally {
            System.out.println("Correct");
        }
    }

}
