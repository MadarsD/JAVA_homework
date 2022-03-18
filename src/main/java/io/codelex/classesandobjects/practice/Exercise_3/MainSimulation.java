package io.codelex.classesandobjects.practice.Exercise_3;

public class MainSimulation {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge(10);
        Odometer odometer = new Odometer(1000);

        System.out.println(fuelGauge.getFuel());

        fuelGauge.fuelUp();
        fuelGauge.fuelUp();
        fuelGauge.fuelUp();

        System.out.println(fuelGauge.getFuel());

        while(fuelGauge.getFuel() != 0){
            odometer.decreaseFuel(fuelGauge);
        }



    }
}
