package io.codelex.classesandobjects.practice.Exercise_2;

public class Car {

    private double startKilometers;
    private double mileage;
    private double liters;


    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
    }

    public double calculateConsumption() {
        return Math.round(liters / (mileage - startKilometers) * 100);
    }

    public boolean gasHog() {
        return calculateConsumption() > 15.0;
    }

    public boolean economyCar() {
        return calculateConsumption() < 5.0;
    }

    public void fillUp(int mileage, double liters) {
        this.mileage = mileage;
        this.liters = liters;
    }
}

