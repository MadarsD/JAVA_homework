package io.codelex.dateandtimepractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        DateTimeFormatter form = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a server launch date [yyyy-mm-dd]: ");
        String d1 = scan.nextLine();
        LocalDate startDate = LocalDate.parse(d1, form);

        int updateInterval = 14;

        for (LocalDate date = startDate; date.isBefore(startDate.plusMonths(1).plusDays(1)); date = date.plusDays(updateInterval)) {
            System.out.println("Next server update: " + startDate.plusDays(updateInterval));
            updateInterval += 14;
        }
    }
}
