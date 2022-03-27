package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Car {
    private final String name;
    private final String model;
    private double price;
    private final int yearOfManufacture;
    private final List<Manufacturer> manufacturers;
    private final EngineType engine;

    public Car(String name, String model, double price, int yearOfManufacture, EngineType engine) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        manufacturers = new ArrayList<>();
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public int getNumberOfManufacturers() {
        return manufacturers.size();
    }

    public void addManufacturer(Manufacturer manufacturer){
        manufacturers.add(manufacturer);
    }

    public boolean relativelyNewCars(Manufacturer manufacturer, int year){
        return manufacturers.contains(manufacturer) && getYearOfManufacture() > year;
    }

    public boolean relativelyOldCars(Manufacturer manufacturer, int year){
        return manufacturers.contains(manufacturer) && getYearOfManufacture() < year;
    }

    public boolean manufacturedAtSpecificYear(Manufacturer manufacturer, int year){
        return manufacturers.contains(manufacturer) && getYearOfManufacture() == year;
    }

    public void printManufacturers(){
        for(Manufacturer factory: manufacturers){
            System.out.println(factory.toString());
        }
    }

    public EngineType getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return  "- " + name + " " + model +
                ", price= " + price + " eur" +
                ", yearOfManufacture= " + yearOfManufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && yearOfManufacture == car.yearOfManufacture && Objects.equals(name, car.name) && Objects.equals(model, car.model) && engine == car.engine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, engine);
    }
}
