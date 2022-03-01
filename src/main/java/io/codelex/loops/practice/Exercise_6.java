package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter random integer:");
        int random = sc.nextInt();

        for (int i = 1; i <= random; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else {
                System.out.print(i + " ");
            }

            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}
