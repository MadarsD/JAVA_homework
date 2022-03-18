package io.codelex.oop.shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 12.5, 13.3);
        System.out.println("Sides: " + rectangle1.getNumSides());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Rectangle area: " + rectangle1.getArea());
        System.out.println("Rectangle perimeter: " + rectangle1.getPerimeter());

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");

        Triangle triangle1 = new Triangle(3, 12.3, 5.4);
        System.out.println("Sides: " + triangle1.getNumSides());
        System.out.println("Height: " + triangle1.getHeight());
        System.out.println("Width: " + triangle1.getWidth());
        System.out.println("Triangle area: " + triangle1.getArea());
        System.out.println("Triangle perimeter: " + triangle1.getPerimeter());
    }

}
