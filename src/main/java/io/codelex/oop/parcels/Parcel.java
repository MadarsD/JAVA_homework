package io.codelex.oop.parcels;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Parcel implements Validatable {
    private BigDecimal xLength;
    private BigDecimal yLength;
    private BigDecimal zLength;
    private BigDecimal weight;
    private boolean isExpress;
    private static final BigDecimal sumDimensionMax = new BigDecimal("300");
    private static final BigDecimal sizeMinimum = new BigDecimal("30");
    private static final BigDecimal isExpressMaxWeight = new BigDecimal("15");
    private static final BigDecimal notExpressMaxWeight = new BigDecimal("30");


    public Parcel(BigDecimal xLength, BigDecimal yLength, BigDecimal zLength, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = (yLength.multiply(zLength).multiply(xLength)).divide(new BigDecimal("5000"), 2, RoundingMode.HALF_UP);
        this.isExpress = isExpress;
    }

    public BigDecimal sumOfDimensions() {
        return xLength.add(zLength).add(yLength);
    }

    public BigDecimal getWeight() {
        return weight;
    }


    @Override
    public boolean validate() {
        if (sumOfDimensions().compareTo(sumDimensionMax) > 0) {
            System.out.print("Your parcel is too large. Sending status= ");
            return false;
        } else if (xLength.compareTo(sizeMinimum) < 0 || yLength.compareTo(sizeMinimum) < 0 || zLength.compareTo(sizeMinimum) < 0) {
            System.out.print("Some size is below allowed limit. Sending status= ");
            return false;
        } else if (isExpress && weight.compareTo(isExpressMaxWeight)>0) {
            System.out.print("Package maximum weight is exceeded. Sending status= ");
            return false;
        } else if (!isExpress && weight.compareTo(notExpressMaxWeight)>0) {
            System.out.print("Package maximum weight is exceeded. Sending status= ");
            return false;
        } else {
            System.out.print("Sending status= ");
        }
        return true;
    }
}
