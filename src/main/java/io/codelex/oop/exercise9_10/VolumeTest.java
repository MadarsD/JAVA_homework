package io.codelex.oop.exercise9_10;

import java.math.BigDecimal;

public class VolumeTest {
    public static void main(String[] args) {
        Cone cone = new Cone(new BigDecimal("20"), new BigDecimal("4"));
        Qube qube = new Qube(new BigDecimal("7.76"));

        System.out.println("Area of cone base= " + cone.calculateArea());
        System.out.println("Volume of cone is= " + cone.calculateVolume());

        System.out.println("==========================================");

        System.out.println("Volume of qube is= " + qube.calculateVolume());

    }
}
