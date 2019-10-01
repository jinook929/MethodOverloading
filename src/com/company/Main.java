package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Jinook", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(5, 7));
        System.out.println(calcFeetAndInchesToCentimeters(77));
    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore (int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore () {
        System.out.println("No Player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid parameters");
            return -1;
        } else {
            double centimeters = (feet * 12 + inches) * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches < 0) {
            System.out.println("Invalid inch value");
            return -1;
        } else {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
    }

}
