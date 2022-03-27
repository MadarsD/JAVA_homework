package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {

    public Zebra(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("IIaaaa");
    }

    @Override
    public void eat(Food food) {
    }

    @Override
    public String toString() {
        return "[" + getAnimalName() +
                ", " + getAnimalWeight() +
                ", " + getLivingRegion() +
                ", " + getFoodEaten() + "]";
    }
}
