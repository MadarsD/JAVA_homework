package io.codelex.oop.shapes;

public class Rectangle extends Shape {

    private final double width;
    private final double height;

    public Rectangle(int numSides, double width, double height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return Math.floor((width * height) * 100) / 100;
    }

    @Override
    public double getPerimeter() {
        return Math.floor((2 * (width + height)) * 100) / 100;
    }
}
