package io.codelex.typesandvariables.practice.exercises;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string and press enter:");
        String a = scanner.nextLine();

        scanner.close();

        int upperCaseCount = 0;

        for(int i = 0; i < a.length(); i++){
            if(Character.isUpperCase(a.charAt(i)))
                upperCaseCount++;
        }

        System.out.println("Your entered string has " + upperCaseCount + " letters in UPPERCASE");
    }
}
