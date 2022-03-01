package io.codelex.loops.practice;

public class Exercise_8 {


    public static void main(String[] args) {
        int n = 7;

        for (int i = 0; i < n; i++) {
            int stars = i * 8;
            for (int j = 0; j < (n-1) * 8; j++) {
                int symbol = (((n-1) * 8) - stars) / 2;
                if(j < symbol){
                    System.out.print("/");
                } else if (j > (symbol + stars) - 1){
                    System.out.print("\\");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
