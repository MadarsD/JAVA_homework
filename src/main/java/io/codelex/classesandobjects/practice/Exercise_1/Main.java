package io.codelex.classesandobjects.practice.Exercise_1;

public class Main {
    public static void main(String[] args) {
        Product mouse = new Product("Logitech mouse", 70.00, 14);
        Product phone = new Product("iPhone 5s", 999.99, 3);
        Product projector = new Product("Epson EB-U05", 440.46, 1);

        mouse.printProduct();
        phone.printProduct();
        projector.printProduct();

        mouse.setAmount(20);
        phone.setPrice(344.33);
        projector.setAmount(3);

        System.out.println("=========New prices and stock=============");

        mouse.printProduct();
        phone.printProduct();
        projector.printProduct();
    }
}
