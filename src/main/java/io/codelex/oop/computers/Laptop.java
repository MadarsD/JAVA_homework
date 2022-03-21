package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer{

    private String batteryType;

    public Laptop(String processor, int ram, String graphicsCard, String company, String model, String batteryType) {
        super(processor, ram, graphicsCard, company, model);
        this.batteryType = batteryType;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    @Override
    public String toString() {
        return super.toString() +
                "; batteryType= " + batteryType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(batteryType, laptop.batteryType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryType);
    }
}
