package io.codelex.classesandobjects.practice.Exercise_3;

public class FuelGauge {
    private int fuel;
    private static final int fullTank = 70;
    private static final int emptyTank = 0;

    public FuelGauge(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void fuelUp() {
        if (fuel == fullTank) {
            System.out.println("Your gas tank is full!");
        } else {
            fuel++;
        }
    }

    public void burnFuel() {
        if (fuel > emptyTank){
            fuel--;
        } else {
            System.out.println("You ran out of gas!");
        }
    }
}
