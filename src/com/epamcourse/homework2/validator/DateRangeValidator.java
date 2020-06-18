package com.epamcourse.homework2.validator;

public class DateRangeValidator {
    public boolean isYearInRange(int year) {
        return ((year > 1945) && (year < 2020));
    }

    public boolean isMonthCorrect(int month) {
        return ((month > 0) && (month < 13));
    }

    public boolean isDayCorrect(int day) {
        return ((day > 0) && (day < 32));
    }
}