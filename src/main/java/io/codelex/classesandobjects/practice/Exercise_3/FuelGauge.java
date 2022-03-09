package io.codelex.classesandobjects.practice.Exercise_3;

public class FuelGauge {
    private static int fuel;

    public FuelGauge(int fuel) {
        this.fuel = fuel;
    }

    public static int getFuel() {
        return fuel;
    }

    public void fuelUp() {
        if (fuel == 70) {
            System.out.println("Your gas tank is full!");
        } else {
            fuel++;
        }
    }

    public static void burnFuel() {
        if (fuel > 0){
            fuel--;
        } else {
            System.out.println("You ran out of gas!");
        }
    }
}
