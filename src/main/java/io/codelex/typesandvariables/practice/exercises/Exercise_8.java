package io.codelex.typesandvariables.practice.exercises;

import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesInYear = 60 * 24 * 365;

        System.out.println("Enter the number of minutes and press enter:");
        double minutes = scanner.nextDouble();
        scanner.close();

        int years = (int) minutes/minutesInYear;
        double days = (double) Math.round((minutes/60/24) % 365 * 100)/100;

        System.out.println();
        System.out.println(minutes + " minutes is around " + years + " years and " + days + " days");
    }
}
