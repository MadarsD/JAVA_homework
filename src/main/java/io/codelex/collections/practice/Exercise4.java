package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> names = new HashSet<>();

        while (true) {
            System.out.print("Enter name: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                names.add(input);
            }
        }
        System.out.println("Unique name list contains: " + names);
    }
}
