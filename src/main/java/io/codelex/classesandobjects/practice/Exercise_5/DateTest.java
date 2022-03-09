package io.codelex.classesandobjects.practice.Exercise_5;

public class DateTest {
    public static void main(String[] args) {
        Date current = new Date(3,5,2022);
        current.displayDate();

        current.setDay(12);
        current.setMonth(8);
        current.displayDate();
    }
}
