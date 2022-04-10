package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        if (isHappyNumber(num)) {
            System.out.println(num + " is happy!");
        } else {
            System.out.println(num + " is not happy!");
        }
    }

    public static boolean isHappyNumber(int num) {
        int happyNumber = 1;
        Set<Integer> unique = new HashSet<>();
        while (unique.add(num)) {
            int value = 0;
            while (num > 0) {
                value += Math.pow(num % 10, 2);
                num /= 10;
            }
            num = value;
        }
        return num == happyNumber;
    }

}
