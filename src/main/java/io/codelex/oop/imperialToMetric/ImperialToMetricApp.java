package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class ImperialToMetricApp {
    public static void main(String[] args) {

        BigDecimal valueToConvert = new BigDecimal("10.5");

        System.out.println(MeasurementConverter.convert(ConversionType.CENTIMETERS_TO_INCHES, valueToConvert));

    }
}
