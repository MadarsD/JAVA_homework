package io.codelex.oop.exercise9_10;

import java.math.BigDecimal;
import java.math.MathContext;

public class Triangle extends Shape {

    private final BigDecimal width;
    private final BigDecimal height;

    public Triangle(BigDecimal width, BigDecimal height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public BigDecimal calculatePerimeter() {
        BigDecimal hypotenuse = (width.pow(2).add(height.pow(2))).sqrt(new MathContext(10));
        return width.add(hypotenuse).add(height);
    }

    @Override
    public BigDecimal calculateArea() {
        return new BigDecimal("0.5").multiply(width.multiply(height));
    }
}
