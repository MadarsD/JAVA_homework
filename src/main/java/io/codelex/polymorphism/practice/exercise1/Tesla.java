package io.codelex.polymorphism.practice.exercise1;

public class Tesla implements Car{
    private String name;
    private Integer currentSpeed = 0;

    public Tesla(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speedUp() {
        currentSpeed += 20;
    }

    public void slowDown() {
        currentSpeed += 20;
    }

    public int showCurrentSpeed() {
        return currentSpeed;
    }

    public void startEngine() {
        System.out.println("-- silence ---");
    }

    @Override
    public String toString() {
        return  name;
    }
}
