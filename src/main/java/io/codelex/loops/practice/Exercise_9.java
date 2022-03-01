package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Desired sum:");
        int desired = sc.nextInt();

        if (desired > 12 || desired < 2){
            throw new RuntimeException("Invalid number!");
        }

        while(true){
            int rollOne = (int) Math.floor(Math.random() * 6) + 1;
            int rollTwo = (int) Math.floor(Math.random() * 6) + 1;
            int sum = rollOne + rollTwo;

            System.out.println(rollOne + " and " + rollTwo + " = " + sum);

            if ((rollOne + rollTwo) == desired){
             break;
            }

        }
    }
}
