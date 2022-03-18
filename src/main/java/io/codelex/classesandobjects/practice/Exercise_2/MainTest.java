package io.codelex.classesandobjects.practice.Exercise_2;

public class MainTest {
    public static void main(String[] args) {
        Car audi = new Car(100);
        Car vaz = new Car(1000);

        audi.fillUp(300, 5);
        vaz.fillUp(1100, 50);
        System.out.println(audi.calculateConsumption());
        System.out.println(vaz.calculateConsumption());

        System.out.println(audi.gasHog());
        System.out.println(audi.economyCar());

        System.out.println(vaz.gasHog());
        System.out.println(vaz.economyCar());

    }

}


