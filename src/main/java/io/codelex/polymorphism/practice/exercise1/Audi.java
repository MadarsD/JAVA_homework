package io.codelex.polymorphism.practice.exercise1;

public class Audi implements Car{
    private String name;
    private Integer currentSpeed = 0;

    public Audi(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speedUp() {
        currentSpeed += 10;
    }

    public void slowDown() {
        currentSpeed += 10;
    }

    public int showCurrentSpeed() {
        return currentSpeed;
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String toString() {
        return  name;
    }
}
