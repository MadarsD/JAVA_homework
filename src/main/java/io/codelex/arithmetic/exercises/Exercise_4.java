package io.codelex.arithmetic.exercises;

public class Exercise_4 {
    public static void main(String[] args) {
        System.out.println(product1ToN());
    }

    public static int product1ToN() {
        int a = 1;
        int b = 10;
        int multiplication = 1;

        for (int i = a; i <= b; i++) {
            multiplication *= i;
        }
return multiplication;
    }
}
