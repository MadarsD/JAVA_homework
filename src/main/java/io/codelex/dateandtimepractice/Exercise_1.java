package io.codelex.dateandtimepractice;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise_1 {

    public static void main(String[] args) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a starting date [yyyy-mm-dd]: ");
        String d1 = scan.nextLine();
        System.out.print("Enter a ending date [yyyy-mm-dd]: ");
        String d2 = scan.nextLine();
        LocalDate start = LocalDate.parse(d1, format);
        LocalDate end = LocalDate.parse(d2, format);

        long workingHours = 0;

        for (LocalDate date = start; date.isBefore(end.plusDays(1)); date = date.plusDays(1)) {
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                workingHours += 0;
            } else {
                workingHours += 8;
            }
        }

        System.out.println("In this period you have worked " + workingHours + " hours");
    }
}


