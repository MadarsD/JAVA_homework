package io.codelex.oop.exercise9_10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cone extends ThreeDShape{

    private final BigDecimal height;
    private final BigDecimal radius;

    public Cone(BigDecimal height, BigDecimal radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public BigDecimal calculateVolume() {
        return (new BigDecimal("1").divide(new BigDecimal("3"), 2, RoundingMode.HALF_UP))
                .multiply(calculateArea())
                .multiply(height)
                .setScale(5, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return null;
    }

    @Override
    public BigDecimal calculateArea() {
        return new BigDecimal(Math.PI).multiply(radius.pow(2)).setScale(5, RoundingMode.HALF_UP);
    }
}
