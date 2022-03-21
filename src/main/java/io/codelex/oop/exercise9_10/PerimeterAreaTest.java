package io.codelex.oop.exercise9_10;

import java.math.BigDecimal;

public class PerimeterAreaTest {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(new BigDecimal("12"), new BigDecimal("5"));
        Triangle triangle = new Triangle(new BigDecimal("4"), new BigDecimal("5"));
        Hexagon hexagon = new Hexagon(new BigDecimal("8"));

        System.out.println("Rectangle area= " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter= " + rectangle.calculatePerimeter());

        System.out.println("===================================");

        System.out.println("Triangle area= " + triangle.calculateArea());
        System.out.println("Triangle perimeter= " + triangle.calculatePerimeter());

        System.out.println("===================================");

        System.out.println("Hexagon area= " + hexagon.calculateArea());
        System.out.println("Hexagon perimeter= " + hexagon.calculatePerimeter());

    }


}
