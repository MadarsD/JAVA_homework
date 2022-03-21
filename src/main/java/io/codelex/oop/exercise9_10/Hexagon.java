package io.codelex.oop.exercise9_10;

import java.math.BigDecimal;
import java.math.MathContext;

public class Hexagon extends Shape {

    private final BigDecimal side;

    public Hexagon(BigDecimal side) {
        this.side = side;
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return new BigDecimal("6").multiply(side);
    }

    @Override
    public BigDecimal calculateArea() {
        return (new BigDecimal("3").multiply(new BigDecimal("3").sqrt(new MathContext(10))).multiply(side.pow(2))).divide(new BigDecimal("2"));
    }
}
