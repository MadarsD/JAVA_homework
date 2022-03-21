package io.codelex.oop.parcels;

import java.math.BigDecimal;

public class ParcelTest {
    public static void main(String[] args) throws Exception {
        Parcel one = new Parcel(new BigDecimal("30"),new BigDecimal("30"),new BigDecimal("30"), true);
        Parcel two = new Parcel(new BigDecimal("20"), new BigDecimal("40"), new BigDecimal("50"), true);
        Parcel three = new Parcel(new BigDecimal("100"),new BigDecimal("130"),new BigDecimal("100"), true);
        Parcel four = new Parcel(new BigDecimal("90"), new BigDecimal("90"), new BigDecimal("90"), true);
        Parcel five = new Parcel(new BigDecimal("50"), new BigDecimal("50"), new BigDecimal("50"), false);

        System.out.println(one.validate());
        System.out.println(two.validate());
        System.out.println(three.validate());
        System.out.println(four.validate());
        System.out.println(five.validate());

    }
}
