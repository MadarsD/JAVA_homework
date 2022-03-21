package io.codelex.oop.exercise9_10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Qube extends ThreeDShape{

    private final BigDecimal side;

    public Qube(BigDecimal side) {
        this.side = side;
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return null;
    }

    @Override
    public BigDecimal calculateArea() {
        return null;
    }

    @Override
    public BigDecimal calculateVolume() {
        return side.pow(3).setScale(5, RoundingMode.HALF_UP);
    }
}
