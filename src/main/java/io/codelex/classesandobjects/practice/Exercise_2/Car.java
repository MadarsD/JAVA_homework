package io.codelex.classesandobjects.practice.Exercise_2;

public class Car {

    private final double startKilometers;
    private double mileage;
    private double liters;
    private static final double highConsumption = 15.0;
    private static final double lowConsumption = 5.0;


    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
    }

    public double calculateConsumption() {
        return Math.round(liters / (mileage - startKilometers) * 100);
    }

    public boolean gasHog() {
        return calculateConsumption() > highConsumption;
    }

    public boolean economyCar() {
        return calculateConsumption() < lowConsumption;
    }

    public void fillUp(int mileage, double liters) {
        this.mileage = mileage;
        this.liters = liters;
    }
}

