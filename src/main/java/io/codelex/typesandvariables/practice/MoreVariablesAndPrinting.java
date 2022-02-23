package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {


        String name;
        String eyes;
        String teeth;
        String hair;
        int age;
        int height;
        int weight;

        name = "Zed A. Shaw";
        age = 35;
        height = 74;
        weight = 180;
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + height + " inches tall, which is equivalent to " + (double) Math.round(height * 2.54 * 100)/100 + " centimeters.");
        System.out.println("He's " + weight + " pounds heavy, which is equivalent to " + (double) Math.round(weight * 0.453592 * 100)/100 + " kilograms.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + height + ", and " + weight
                + " I get " + (age + height + weight) + ".");
    }
}

//