package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        if (isHappy_number(num)) {
            System.out.println(num + " is happy!");
        } else {
            System.out.println(num + " is not happy!");
        }
    }

    public static boolean isHappy_number(int num) {
        Set<Integer> unique = new HashSet<>();
        while (unique.add(num)) {
            int value = 0;
            while (num > 0) {
                value += Math.pow(num % 10, 2);
                num /= 10;
            }
            num = value;
        }

        return num == 1;
    }

}
