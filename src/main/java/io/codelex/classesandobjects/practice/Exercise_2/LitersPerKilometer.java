package io.codelex.classesandobjects.practice.Exercise_2;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main( String[] args )  {

//        Scanner scan = new Scanner(System.in);

//        double startKilometers, endKilometers, liters;
//
//        System.out.print("Enter first reading: " );
//        startKilometers = scan.nextDouble();
//
//        System.out.print("Enter second reading: " );
//        endKilometers = scan.nextDouble();
//
//        System.out.print("Enter liters consumed: " );
//        liters  = scan.nextDouble();
//
//        Car car = new Car(startKilometers, endKilometers, liters);
//
//        System.out.print("Enter first reading for second car: " );
//        startKilometers = scan.nextDouble();
//
//        System.out.print("Enter second reading for second car: " );
//        endKilometers = scan.nextDouble();
//
//        System.out.print("Enter liters consumed for second car: " );
//        liters  = scan.nextDouble();
//
//        Car car2 = new Car(startKilometers,endKilometers,liters);
//
//        System.out.println();
//        System.out.println( "Liters per 100km for first car are " + car.calculateConsumption());
//        System.out.println("This car is: gas hog - " + car.gasHog() + "; or economy - " + car.economyCar());
//        System.out.println();
//        System.out.println( "Liters per 100km for second car are " + car2.calculateConsumption());
//        System.out.println("This car is: gas hog - " + car2.gasHog() + "; or economy - " + car2.economyCar());


        Car car = new Car(1);
        car.fillUp(135,10);
        System.out.println(car.calculateConsumption());
    }
}
