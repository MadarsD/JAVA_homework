package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder requiredDots = new StringBuilder();
        int separation = 0;

        System.out.println("Enter first word:");
        String first = sc.nextLine();

        System.out.println("Enter second word:");
        String second = sc.nextLine();

        int totalWordLength = (first + second).length();

        if (totalWordLength <= 30) {
            separation = 30 - totalWordLength;
            for (int i = 0; i < separation; i++) {
                requiredDots.append(".");
            }
            System.out.println(first + requiredDots + second);
        } else {
            System.out.println(first + second);
        }
    }
}
