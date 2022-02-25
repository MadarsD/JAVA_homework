package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;
import java.util.Scanner;

class Geometry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geometry calculator:");
        System.out.println("1 to Calculate the Area of a Circle\n" +
                "2 to Calculate the Area of a Rectangle\n" +
                "3 to Calculate the Area of a Rectangle\n" +
                "4 to Quit\n" +
                "Enter your choice (1-4)");

        int input = scanner.nextInt();

        if(input < 1 || input > 4){
            throw new RuntimeException("Invalid number!");
        }


        switch (input) {
            case 1:
                System.out.println("Enter the radius of circle:");
                BigDecimal radius = scanner.nextBigDecimal();
                System.out.println("Area of circle is " + areaOfCircle(radius));
                break;
            case 2:
                System.out.println("Enter the length of a rectangle:");
                BigDecimal length = scanner.nextBigDecimal();
                System.out.println("Enter the width of a rectangle:");
                BigDecimal width = scanner.nextBigDecimal();
                System.out.println("Area of rectangle is " + areaOfRectangle(length, width));
                break;
            case 3:
                System.out.println("Enter the base of a triangle:");
                BigDecimal base = scanner.nextBigDecimal();
                System.out.println("Enter the height:");
                BigDecimal height = scanner.nextBigDecimal();
                System.out.println("Area of triangle is " + areaOfTriangle(base, height));
                break;
            case 4:
                System.out.println("Program quitting");
                scanner.close();
                break;
        }
    }



    static double areaOfCircle(BigDecimal radius) {
        BigDecimal pi = new BigDecimal(Math.PI);
        if (radius.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("Radius cannot be negative value.");
        }
        return pi.multiply(radius.multiply(radius)).doubleValue();
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        if (length.compareTo(BigDecimal.ZERO) < 0 || width.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("Length or width cannot be negative values.");
        }
        return length.multiply(width).doubleValue();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        BigDecimal half = new BigDecimal("0.5");
        if (base.compareTo(BigDecimal.ZERO) < 0 || h.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("Base or height cannot be negative values.");
        }
        return base.multiply(h).multiply(half).doubleValue();
    }
}
