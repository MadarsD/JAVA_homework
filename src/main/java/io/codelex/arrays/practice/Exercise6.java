package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {

        int[] array1 = new int[10];

        for(int i = 0; i <array1.length; i++){
            int randomNumber = (int) (Math.floor(Math.random() * 100) + 1);
            array1[i] = randomNumber;
        }


        int[] array2 = Arrays.copyOf(array1, array1.length);
        array1[array1.length -1] = -7;

        System.out.println("Array 1:" + Arrays.toString(array1));
        System.out.println("Array 2:" + Arrays.toString(array2));

    }
}
