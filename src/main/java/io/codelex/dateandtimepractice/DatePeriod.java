package io.codelex.dateandtimepractice;

import java.time.LocalDate;
import java.util.Date;

public class DatePeriod {

    private LocalDate start;
    private LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "overlap start date " + String.format("%02d", start.getDayOfMonth()) + "." + String.format("%02d", start.getMonthValue()) + "." + start.getYear()
                + " and end date " + String.format("%02d", end.getDayOfMonth()) + "." + String.format("%02d", end.getMonthValue()) + "." + end.getYear();
    }

    public DatePeriod intersection(DatePeriod period) {
        if (notOverLapping(period)) {
            return null;
        } else if (completelyIncludes(period)) {
            return new DatePeriod(this.start, this.end);
        } else if (this.end.isEqual(period.getStart())) {
            return new DatePeriod(this.end, period.getStart());
        } else if (this.start.isEqual(period.getEnd())) {
            return new DatePeriod(this.start, period.getEnd());
        } else if (this.start.isBefore(period.getStart()) && this.end.isAfter(period.getEnd())) {
            return new DatePeriod(period.getStart(), period.getEnd());
        } else {
            LocalDate startOverlap = null;
            LocalDate endOverlap = null;
            if (period.getStart().isBefore(this.end)) {
                startOverlap = period.getStart();
                endOverlap = this.end;
            } else if (period.getEnd().isAfter(this.start)) {
                startOverlap = this.start;
                endOverlap = period.getEnd();
            }
            period = new DatePeriod(startOverlap, endOverlap);
        }
        return period;
    }

    public boolean notOverLapping(DatePeriod period) {
        return this.end.isBefore(period.getStart()) || period.getEnd().isBefore(this.start);
    }

    public boolean completelyIncludes(DatePeriod period){
        return this.start.isAfter(period.getStart()) && this.end.isBefore(period.getEnd());
    }

}

