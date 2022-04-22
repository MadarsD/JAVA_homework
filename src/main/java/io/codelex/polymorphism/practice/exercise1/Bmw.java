package io.codelex.polymorphism.practice.exercise1;

public class Bmw implements Car {
    private String name;
    private Integer currentSpeed = 0;

    public Bmw(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void speedUp() {
        currentSpeed += 12;
    }

    @Override
    public void slowDown() {
        currentSpeed += 12;
    }

    @Override
    public int showCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String toString() {
        return name;
    }
}
