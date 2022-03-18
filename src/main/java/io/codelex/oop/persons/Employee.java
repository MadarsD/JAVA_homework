package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee extends Person {

    private final String position;
    private final LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, int year, int day) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = LocalDate.ofYearDay(year, day);
    }

    public int getWorkExperience(){
        return (int) ChronoUnit.YEARS.between(startedWorking, LocalDate.now());
    }

    @Override
    public String getInfo() {
        return position + " " + getFirstName() + " " +
                getLastName() + " " + "(" + getWorkExperience() + " years)";
    }
}
