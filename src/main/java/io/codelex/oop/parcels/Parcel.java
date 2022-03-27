package io.codelex.oop.parcels;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Parcel implements Validatable {

    private static final BigDecimal SUM_DIMENSION_MAX = new BigDecimal("300");
    private static final BigDecimal SIZE_MINIMUM = new BigDecimal("30");
    private static final BigDecimal IS_EXPRESS_MAX_WEIGHT = new BigDecimal("15");
    private static final BigDecimal NOT_EXPRESS_MAX_WEIGHT = new BigDecimal("30");

    private BigDecimal xLength;
    private BigDecimal yLength;
    private BigDecimal zLength;
    private BigDecimal weight;
    private boolean isExpress;

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
        if (isTooLarge()) {
            System.out.print("Your parcel is too large. Sending status= ");
            return false;
        } else if (notAllowedDimensions()) {
            System.out.print("Some size is below allowed limit. Sending status= ");
            return false;
        } else if (notExpressPackage()) {
            System.out.print("Package maximum weight is exceeded. Sending status= ");
            return false;
        } else if (isTooHeavy()) {
            System.out.print("Package maximum weight is exceeded. Sending status= ");
            return false;
        } else {
            System.out.print("Sending status= ");
        }
        return true;
    }

    public boolean isTooLarge() {
        return sumOfDimensions().compareTo(SUM_DIMENSION_MAX) > 0;
    }

    public boolean notAllowedDimensions(){
        return xLength.compareTo(SIZE_MINIMUM) < 0 || yLength.compareTo(SIZE_MINIMUM) < 0 || zLength.compareTo(SIZE_MINIMUM) < 0;
    }

    public boolean notExpressPackage(){
        return isExpress && weight.compareTo(IS_EXPRESS_MAX_WEIGHT) > 0;
    }

    public boolean isTooHeavy(){
        return !isExpress && weight.compareTo(NOT_EXPRESS_MAX_WEIGHT) > 0;
    }


}
