package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class MetersToYardConverter extends UnitConverter {

    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal("1.0936133");
    }
}
