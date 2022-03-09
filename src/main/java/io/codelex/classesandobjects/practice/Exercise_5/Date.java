package io.codelex.classesandobjects.practice.Exercise_5;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month > 12 || month <1){
            System.out.println("Invalid month!");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 0){
            System.out.println("Invalid year!");
        }
        this.year = year;
    }

    public void displayDate(){
        System.out.println(month + "/" + day + "/" + year);
    }
}
