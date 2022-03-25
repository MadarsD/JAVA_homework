package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert{
    private double lengthInCentimeters;
    private double heightInCentimeters;
    private final int copies;
    private final int costPerCopy;

    public Poster(double length, double height, int copies) {
        this.lengthInCentimeters = length;
        this.heightInCentimeters = height;
        this.copies = copies;
        if (calculateArea(height, length) < 1000) {
            costPerCopy = 50;
        } else {
            costPerCopy = 100;
        }
    }

    public double calculateArea(double height, double length){
        this.heightInCentimeters = height;
        this.lengthInCentimeters = length;
        return height * length;
    }

    @Override
    public int cost() {
        return copies * costPerCopy;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + copies + " copies of "
                + calculateArea(heightInCentimeters, lengthInCentimeters) + " cm2 posters";
    }
}
