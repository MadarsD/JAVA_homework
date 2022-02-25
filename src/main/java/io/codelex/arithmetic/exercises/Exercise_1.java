package io.codelex.arithmetic.exercises;

public class Exercise_1 {
    public static void main(String[] args) {
        System.out.println(checkIntegers(-10, 5));
    }

    public static boolean checkIntegers(int a, int b){
        if(a == 15 || b == 15) {
            return true;
        } else if ( a + b == 15) {
            return true;
        } else return a - b == 15 || b - a == 15;
    }
}
