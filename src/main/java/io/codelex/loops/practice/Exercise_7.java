package io.codelex.loops.practice;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean rollAgain = true;
        int totalPoints = 0;

        System.out.println("Welcome to Piglet!");
        while (rollAgain) {
            int roll = (int) Math.floor(Math.random() * 6) + 1;

            if (roll == 1) {
                System.out.println("You rolled a " + roll);
                System.out.println("You got 0 points.");
                rollAgain = false;
            } else {
                System.out.println("You rolled a " + roll);
                totalPoints += roll;

                System.out.println("Roll again? Type yes or no");
                String decision = sc.nextLine().toLowerCase(Locale.ROOT);

                if (decision.equals("no")) {
                    System.out.println("You got " + totalPoints + " points.");
                    break;
                }
            }
        }
    }
}
