package io.codelex.oop.exercise9_10;

import java.math.BigDecimal;

public class Rectangle extends Shape {

    private final BigDecimal length;
    private final BigDecimal width;

    public Rectangle(BigDecimal length, BigDecimal width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return new BigDecimal("2").multiply(width.add(length));
    }

    @Override
    public BigDecimal calculateArea() {
        return width.multiply(length);
    }
}
