package model;

import java.time.LocalDate;

public class DateOfEmployment implements Comparable<DateOfEmployment> {
    private LocalDate date;

    public DateOfEmployment(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }

    public int getYear() {
        return date.getYear();
    }

    public void setYear(int year) {
        this.date = LocalDate.of(year, date.getMonthValue(), date.getDayOfMonth());
    }

    public int getMonth() {
        return date.getMonthValue();
    }

    public void setMonth(int month) {
        this.date = LocalDate.of(date.getYear(), month, date.getDayOfMonth());
    }

    public int getDay() {
        return date.getDayOfMonth();
    }

    public void setDay(int day) {
        this.date = LocalDate.of(date.getYear(), date.getMonthValue(), day);
    }

    @Override
    public int compareTo(DateOfEmployment o) {
        // Earlier dates are "less than" later dates
        return this.date.compareTo(o.date);
    }

    @Override
    public String toString() {
        return date.toString(); // Example: 2024-12-07
    }
}
