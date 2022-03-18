package io.codelex.oop.cars;

import java.util.*;
import java.util.stream.Collectors;

public class CarService {

    private final List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
    }

    public void addCars(Car car) {
        cars.add(car);
    }

    public void removeCars(Car car) {
        cars.remove(car);
    }

    public void printAllCars() {
        System.out.println("Cars currently in our service:");
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }

    public void printV12() {
        System.out.println("Cars in service with V12 engines:");
        for (Car car : cars) {
            if (car.getEngine() == engineType.V12) {
                System.out.println(car.getName() + " " + car.getModel());
            }
        }
    }

    public void olderThan1999() {
        System.out.println("Cars in service older than 1999:");
        for (Car car : cars) {
            if (car.getYearOfManufacture() < 1999) {
                System.out.println(car.getName() + " " + car.getModel() + " " + car.getYearOfManufacture());
            }
        }
    }

    public void mostExpensiveCar() {
        System.out.println("Most expensive car in service:");
        double highestPrice = Double.MIN_VALUE;
        Car expensive = new Car("", "", 0, 0, null);
        for (Car car : cars) {
            if (car.getPrice() > highestPrice) {
                expensive = car;
                highestPrice = car.getPrice();
            }
        }
        System.out.println(expensive.getName() + " " + expensive.getModel() + " " + expensive.getPrice() + " eur");
    }

    public void cheapestCar() {
        System.out.println("Cheapest car in service:");
        double lowestPrice = Double.MAX_VALUE;
        Car cheapest = new Car("", "", 0, 0, null);
        for (Car car : cars) {
            if (car.getPrice() < lowestPrice) {
                cheapest = car;
                lowestPrice = car.getPrice();
            }
        }
        System.out.println(cheapest.getName() + " " + cheapest.getModel() + " " + cheapest.getPrice() + " eur");
    }

    public void atLeastThreeManufacturers() {
        System.out.println("Cars with at least three manufacturers:");
        for (Car car : cars) {
            if (car.getNumberOfManufacturers() >= 3) {
                System.out.println(car.getName() + " " + car.getModel() + " (" + car.getNumberOfManufacturers() + " manufacturers)");
            }
        }
    }

    public void sortedByPrice(String condition) {
        if (condition.equals("ascending")) {
            List<Car> ascendingPrice = cars.stream()
                    .sorted(Comparator.comparing(Car::getPrice)).toList();
            System.out.println("Cars sorted by price ascending:");
            for (Car car : ascendingPrice) {
                System.out.println(car.getName() + " " + car.getModel() + " " + car.getPrice());
            }
        } else if (condition.equals("descending")) {
            List<Car> descendingPrice = cars.stream()
                    .sorted(Comparator.comparing(Car::getPrice).reversed()).
                    toList();
            System.out.println("Cars sorted by price descending:");
            for (Car car : descendingPrice) {
                System.out.println(car.getName() + " " + car.getModel() + " " + car.getPrice() + " eur");
            }
        } else {
            System.out.println("Invalid input argument!");
        }
    }

    public void sortedByYearOfManufacture(String condition) {
        if (condition.equals("ascending")) {
            List<Car> ascendingYear = cars.stream()
                    .sorted(Comparator.comparing(Car::getYearOfManufacture)).toList();
            System.out.println("Cars sorted by year of manufacture ascending:");
            for (Car car : ascendingYear) {
                System.out.println(car.getName() + " " + car.getModel() + " " + car.getYearOfManufacture());
            }
        } else if (condition.equals("descending")) {
            List<Car> descendingYear = cars.stream()
                    .sorted(Comparator.comparing(Car::getYearOfManufacture).reversed()).
                    toList();
            System.out.println("Cars sorted by year of manufacture descending:");
            for (Car car : descendingYear) {
                System.out.println(car.getName() + " " + car.getModel() + " " + car.getYearOfManufacture());
            }
        } else {
            System.out.println("Invalid input argument!");
        }
    }

    public boolean checkIfCarIsOnList(Car c) {
        System.out.print("Current " + c.getName() + " " + c.getModel() + " is in our list: ");
        return cars.contains(c);
    }

    public void findByManufacturer(Manufacturer x) {
        System.out.println("Cars manufactured by " + x.getName() + " manufacture are:");
        for (Car car : cars) {
            if (car.getManufacturers().contains(x)) {
                System.out.println(car.getName() + " " + car.getModel());
            }
        }
    }

    public void carsByManufacturer(Manufacturer x, int year) {
        System.out.println("Cars manufactured by " + x.getName() + " after " + year + " year are:");
        int countAfter = 0;
        for (Car car : cars) {
            if (car.getManufacturers().contains(x) && car.getYearOfManufacture() > year) {
                countAfter++;
                System.out.println(car.getName() + " " + car.getModel() + " " + car.getYearOfManufacture());
            }
        }
        if(countAfter == 0){
            System.out.println("None");
        }

        System.out.println("Cars manufactured by " + x.getName() + " before " + year + " year are:");
        int countBefore = 0;
        for (Car car : cars) {
            if (car.getManufacturers().contains(x) && car.getYearOfManufacture() < year) {
                countBefore++;
                System.out.println(car.getName() + " " + car.getModel() + " " + car.getYearOfManufacture());
            }
        }
        if(countBefore == 0){
            System.out.println("None");
        }

        System.out.println("Cars manufactured by " + x.getName() + " this year are:");
        int count = 0;
        for (Car car : cars) {
            if (car.getManufacturers().contains(x) && car.getYearOfManufacture() == year) {
                count++;
                System.out.println(car.getName() + " " + car.getModel() + " " + car.getYearOfManufacture());
            }
        }
        if(count == 0){
            System.out.println("None");
        }

    }

}
