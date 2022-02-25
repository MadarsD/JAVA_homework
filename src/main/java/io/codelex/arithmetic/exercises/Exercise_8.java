package io.codelex.arithmetic.exercises;

public class Exercise_8 {
    public static void main(String[] args) {
        System.out.println("Employee 1");
        //System.out.println(salaryFooCorporation(35, 7.50) + "$");

        System.out.println("Employee 2");
        System.out.println(salaryFooCorporation(47, 8.20) + "$");

        System.out.println("Employee 1");
        System.out.println(salaryFooCorporation(73, 10.00) + "$");
    }

    public static double salaryFooCorporation(int hours, double basePay) {
        double howMuchToPay;
        double extraHourPay = basePay * 1.5;
        double maximumSalary = 560.00; //(40*8) + (20*12)

        if (basePay < 8.00) {
            throw new RuntimeException("Base pay must be at least 8.00$");
        }
        if (hours <= 40) {
            System.out.println("Your salary is:");
            howMuchToPay = hours * basePay;
        } else if (hours <= 60) {
            System.out.println("Your salary is:");
            howMuchToPay = (40 * basePay) + ((hours - 40) * extraHourPay);
        } else {
            throw new RuntimeException("Error. Hours greater than 60");
        }
        return howMuchToPay;
    }
}
