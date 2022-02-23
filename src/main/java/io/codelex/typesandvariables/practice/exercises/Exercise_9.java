package io.codelex.typesandvariables.practice.exercises;

import java.util.Scanner;

public class Exercise_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your covered distance in meters");
        double meters = scanner.nextDouble();

        System.out.println("Enter the hours you spent in the distance");
        double hours = scanner.nextDouble();

        System.out.println("Enter the minutes you spent in the distance");
        double minutes = scanner.nextDouble();

        System.out.println("Enter the seconds you spent in the distance");
        double seconds = scanner.nextDouble();

        double totalSeconds = seconds + (60 * minutes) + (3600 * hours);

        double speedMetersPerSecond = meters / totalSeconds;
        double speedKilometersPerHour = (meters/1000d) / (totalSeconds/3600d);
        double speedMilesPerHour = speedKilometersPerHour / 1.609d;

        System.out.println("Your speed in meters/second is " + (Math.round(speedMetersPerSecond * 100000000d))/100000000d);
        System.out.println("Your speed in km/h is " + (Math.round(speedKilometersPerHour * 100000000d))/100000000d);
        System.out.println("Your speed in miles/h is " + (Math.round(speedMilesPerHour * 100000000d))/100000000d);

    }
}
