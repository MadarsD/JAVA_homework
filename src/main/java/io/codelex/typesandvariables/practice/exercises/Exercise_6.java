package io.codelex.typesandvariables.practice.exercises;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = scanner.nextInt();

        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        System.out.println("Enter third number:");
        int c = scanner.nextInt();

        System.out.println("The sum of your entered numbers are " + (a + b + c));
    }
}
