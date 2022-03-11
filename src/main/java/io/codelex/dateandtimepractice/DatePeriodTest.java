package io.codelex.dateandtimepractice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;

public class DatePeriodTest {
    public static void main(String[] args) {
        LocalDate firstStart = LocalDate.of(2022, 2, 10);
        LocalDate firstEnd = LocalDate.of(2022, 3, 20);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 2, 9);
        LocalDate secondEnd = LocalDate.of(2022, 3, 21);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);
        System.out.println(overlap);



    }
}
