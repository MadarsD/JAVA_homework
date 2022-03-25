package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car, Boost {
    private String name;
    private Integer currentSpeed = 0;

    public Lexus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speedUp() {
        currentSpeed += 8;
    }

    public void slowDown() {
        currentSpeed += 8;
    }

    public int showCurrentSpeed() {
        return currentSpeed;
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String toString() {
        return  name;
    }
}
