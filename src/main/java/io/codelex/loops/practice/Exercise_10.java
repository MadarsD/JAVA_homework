package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter min integer value:");
        int a = sc.nextInt();

        System.out.println("Enter max integer value:");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++){
            for (int j = i; j <= b; j++){
                System.out.print(j);
            }
            for (int k = 0; k < i - a; k++){
                System.out.print(a + k);
            }
            System.out.println();
        }
    }
}
