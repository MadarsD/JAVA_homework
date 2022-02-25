package io.codelex.arithmetic.exercises;

public class Exercise_2 {
    public static void main(String[] args) {
checkOddEven(3);
    }

    public static void checkOddEven(int a){
        if (a % 2 == 0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        System.out.println("Bye!");
    }
}
