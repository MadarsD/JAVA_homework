package io.codelex.classesandobjects.practice.Exercise_3;

public class Odometer {
    private static int mileage;

    public Odometer(int mileage) {
        this.mileage = mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public static int getMileage() {
        return mileage;
    }

    public static void incrementMileage(){
        if(mileage < 999999){
            mileage++;
        } else {
            mileage = 0;
        }
    }

    public static void decreaseFuel(){
        int temp = 10;
        while(temp > 0){
            incrementMileage();
            System.out.println("Current mileage: " + Odometer.getMileage() + ". Remaining fuel = " + FuelGauge.getFuel());
            temp--;
        }
        if(temp == 0){
            FuelGauge.burnFuel();
        }

    }
}
