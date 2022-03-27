package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        DecimalFormat format = new DecimalFormat("0.#");

        List<String> animals = new ArrayList<>();

        Vegetable vegetable = new Vegetable(0);
        Meat meat = new Meat(0);

        Cat cat = new Cat(null, "Cat", 0, 0, null, null);
        Tiger tiger = new Tiger(null, "Tiger", 0, 0, null);
        Mouse mouse = new Mouse(null, "Mouse", 0, 0, null);
        Zebra zebra = new Zebra(null, "Zebra", 0, 0, null);


        boolean flag = false;
        System.out.println("You will enter animal type animalName Weight livingRegion and breed(in case it is cat)");

        while (!flag) {
            System.out.println("Enter animal type (cat, tiger, zebra or mouse): ");
            String animalType = scanner.next().toLowerCase(Locale.ROOT);
            System.out.println("Enter animal name: ");
            String animalName = scanner.next();
            System.out.println("Enter animal weight: ");
            double animalWeight = scanner.nextDouble();
            format.format(animalWeight);
            scanner.nextLine();
            System.out.println("Enter animal livingRegion: ");
            String animalLivingRegion = scanner.nextLine();
            String breed = "";
            if(animalType.equals("cat")){
                System.out.println("Enter cats breed: ");
                breed = scanner.next();
            }

            System.out.println("Enter food type (meat or vegetable): ");
            String foodType = scanner.next().toLowerCase(Locale.ROOT);
            System.out.println("Enter food quantity: ");
            int quantity = scanner.nextInt();


            switch (animalType) {
                case "cat":
                    cat.setAnimalName(animalName);
                    cat.setAnimalWeight(animalWeight);
                    cat.setLivingRegion(animalLivingRegion);
                    cat.setBreed(breed);

                    cat.makeSound();
                    cat.setFoodEaten(quantity);
                    animals.add(animalType + cat);
                    break;

                case "tiger":
                    tiger.setAnimalName(animalName);
                    tiger.setAnimalWeight(animalWeight);
                    tiger.setLivingRegion(animalLivingRegion);

                    if (foodType.equals("meat")) {
                        tiger.makeSound();
                        tiger.setFoodEaten(quantity);
                    } else {
                        tiger.setFoodEaten(0);
                        animals.add(animalType + tiger);
                        System.out.println(animalType + " is not eating that type of food!");
                        System.out.println("End");
                        flag = true;
                        break;
                    }
                    animals.add(animalType + tiger);
                    break;

                case "mouse":
                    mouse.setAnimalName(animalName);
                    mouse.setAnimalWeight(animalWeight);
                    mouse.setLivingRegion(animalLivingRegion);

                    if (foodType.equals("vegetable")) {
                        mouse.makeSound();
                        mouse.setFoodEaten(quantity);
                    } else {
                        mouse.setFoodEaten(0);
                        animals.add(animalType + mouse);
                        System.out.println(animalType + " is not eating that type of food!");
                        System.out.println("End");
                        flag = true;
                        break;
                    }
                    animals.add(animalType + mouse);
                    break;

                case "zebra":
                    zebra.setAnimalName(animalName);
                    zebra.setAnimalWeight(animalWeight);
                    zebra.setLivingRegion(animalLivingRegion);

                    if (foodType.equals("vegetable")) {
                        zebra.makeSound();
                        zebra.setFoodEaten(quantity);
                    } else {
                        zebra.setFoodEaten(0);
                        animals.add(animalType + zebra);
                        System.out.println(animalType + " is not eating that type of food!");
                        System.out.println("End");
                        flag = true;
                        break;
                    }
                    animals.add(animalType + zebra);
                    break;
            }
            System.out.println(animals);
        }

    }
}
