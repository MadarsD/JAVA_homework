package io.codelex.polymorphism.practice.exercise1;

import java.util.*;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) throws NoSuchMethodException {

        Audi audi = new Audi("audi");
        Bmw bmw = new Bmw("bmw");
        Ferrari ferrari = new Ferrari("ferrari");
        Ford ford = new Ford("ford");
        Lexus lexus = new Lexus("lexus");
        Tesla tesla = new Tesla("tesla");

        List<Car> cars = new ArrayList<>();
        cars.add(audi);
        cars.add(bmw);
        cars.add(ferrari);
        cars.add(ford);
        cars.add(lexus);
        cars.add(tesla);

        int iteration = 1;
        while (iteration <= 10) {
            if (iteration == 3) {
                lexus.useNitrousOxideEngine();
            }
            for (Car car : cars) {
                car.speedUp();
            }
            iteration++;
        }

        Optional<Car> fastest = cars.stream()
                .max(Comparator.comparingInt(Car::showCurrentSpeed));

        System.out.println(fastest.get() + " with " + fastest.get().showCurrentSpeed() + " kmh/h");

//        int fastest = 0;
//        String carName = "";
//        for (Car car : cars) {
//            if (car.showCurrentSpeed() > fastest) {
//                fastest = car.showCurrentSpeed();
//                carName = car.toString();
//            }
//        }
//
//        System.out.println("Fastest car is " + carName + " with " + fastest + " km/h");
    }
}
