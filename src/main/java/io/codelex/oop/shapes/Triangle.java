package io.codelex.oop.shapes;

public class Triangle extends Shape {

    private final double width;
    private final double height;

    public Triangle(int numSides, double width, double height) {
        super(numSides);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return Math.floor(((height * width) / 2) * 100) / 100;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.pow(Math.pow(width, 2) + Math.pow(height, 2), 0.5);
        return Math.floor((height + width + hypotenuse) * 100) / 100;
    }
}
