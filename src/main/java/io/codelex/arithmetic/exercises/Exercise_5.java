package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int randomInt = (int) (Math.random() * 100);
            //System.out.println(randomInt);

            System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
            int guess = scanner.nextInt();

            if (guess < randomInt) {
                System.out.println("Sorry, you are too low. I was thinking of " + randomInt + ". Try again!");
            } else if (guess > randomInt) {
                System.out.println("Sorry, you are too high. I was thinking of " + randomInt + ". Try again!");
            } else {
                System.out.println("You guessed it! What are the odds?!?");
                break;
            }
        }
    }
}
