package io.codelex.classesandobjects.practice.Exercise_3;

public class Odometer {
    private int mileage;
    private static final int odometerCapacity = 999999;

    public Odometer(int mileage) {
        this.mileage = mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void incrementMileage(){
        if(mileage < odometerCapacity){
            mileage++;
        } else {
            mileage = 0;
        }
    }

    public void decreaseFuel(FuelGauge fuelGauge){
        int temp = 10;
        while(temp > 0){
            incrementMileage();
            System.out.println("Current mileage: " + getMileage() + ". Remaining fuel = " + fuelGauge.getFuel());
            temp--;
        }
        if(temp == 0){
            fuelGauge.burnFuel();
        }

    }
}
