package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime{

    public Tiger(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Roarr");
    }

    @Override
    public void eat(Food food) {
        System.out.println(food);
    }

    @Override
    public String toString() {
        return "[" + getAnimalName() +
                ", " + getAnimalWeight() +
                ", " + getLivingRegion() +
                ", " + getFoodEaten() + "]";
    }
}
