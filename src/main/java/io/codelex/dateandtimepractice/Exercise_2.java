package io.codelex.dateandtimepractice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        DateTimeFormatter form = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a server launch date [yyyy-mm-dd]: ");
        String d1 = scan.nextLine();
        LocalDate startDate = LocalDate.parse(d1, form);

        int x = 14;

        for (LocalDate date = startDate; date.isBefore(startDate.plusMonths(1).plusDays(1)); date = date.plusDays(x)) {
            System.out.println("Next server update: " + startDate.plusDays(x-1));
            x += 14;
        }
    }
}
