package io.codelex.polymorphism.practice.exercise6;

public class Vegetable extends Food{

    public Vegetable(int quantity) {
        super(quantity);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vegetable");
        return sb.toString();
    }
}
