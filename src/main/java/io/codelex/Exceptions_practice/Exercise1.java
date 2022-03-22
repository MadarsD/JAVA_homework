package io.codelex.Exceptions_practice;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {

            int numerator = 0;
            int divisor = 0;
            try {
                String input = "";
                System.out.println("Enter the numerator");
                input = scanner.next();
                if (input.toLowerCase(Locale.ROOT).charAt(0) == 'q') {
                    System.out.println("Enter the numerator: quit");
                    break;
                } else {
                    numerator = Integer.parseInt(input);
                }
                System.out.println("Enter the divisor");
                divisor = scanner.nextInt();
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
                scanner.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("You can't divide " + numerator + " by " + divisor);
                scanner.nextLine();
            }
        }
    }

}
