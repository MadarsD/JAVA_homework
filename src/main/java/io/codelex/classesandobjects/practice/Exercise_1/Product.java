package io.codelex.classesandobjects.practice.Exercise_1;


public class Product {

    private final String name;
    private double price;
    private int amount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void printProduct(){
        System.out.println(name + ", price " + price + " EUR, amount " + amount + " units");
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
