package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime{

    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Meoww");
    }

    @Override
    public void eat(Food food) {
        System.out.println(food);
    }

    @Override
    public String toString() {
        return "[" + getAnimalName() +
                ", " + breed +
                ", " + getAnimalWeight() +
                ", " + getLivingRegion() +
                ", " + getFoodEaten() + "]";
    }
}
