package io.codelex.arithmetic.exercises;

public class Exercise_9 {
    public static void main(String[] args) {
calculateBMI(90, 185);
    }

    public static void calculateBMI(double weightInKilograms, double heightInCentimeters) {
        double weightInPounds = weightInKilograms * 2.2046;
        double heightInInches = heightInCentimeters * 0.3937;

        //Correct BMI calculation formula
        double BMI = weightInPounds/ (heightInInches * heightInInches) * 703;
        if(BMI < 18.5){
            System.out.println("According to BMI you are considered underweight");
        } else if (BMI <= 25){
            System.out.println("According to BMI you have optimal weight");
        } else{
            System.out.println("According to BMI you are overweight");
        }

    }
}
