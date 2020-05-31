package com.epamcourse.homework1.task2;

import java.util.Scanner;

public class LeapYear {
    public final int FOUR = 4;
    public final int FOUR_HUNDRED = 400;
    public final int HUNDRED = 100;
    public int year;
    public int monthNumber;
    public  int daysInMonth;
    public boolean leap;
    int[] leapMonth = { 31,29,31,30,31,30,31,31,30, 31, 30, 31 };
    int[] notLeapMonth = { 31,28,31,30,31,30,31,31,30, 31, 30, 31 };

    Scanner in = new Scanner(System.in);

    public int enterYear() {
        System.out.println("Enter year");
        year = in.nextInt();

        return year;

    }
    public int enterMonth() {
        System.out.println("Enter the month number");
        monthNumber = in.nextInt();

        return monthNumber;

    }

    public boolean checkForLeap() {
        enterYear();
        enterMonth();

        if (year % HUNDRED == 0 && year % FOUR_HUNDRED == 0) {
            System.out.println("number of days per year: 366");
            return leap = true;

        } else if (year % FOUR == 0 && year % HUNDRED > 0) {
            System.out.println("number of days per year: 366");
            return leap = true;

        } else if (year % HUNDRED == 0) {
            System.out.println("number of days per year: 365");
            return leap = false;

        } else {
            System.out.println("number of days per year: 365");
            return leap = false;
        }

    }

    public int run() {
        checkForLeap();
        System.out.print("amount of days in this month: ");

        if (leap == true) {
        daysInMonth = leapMonth[monthNumber-1];
            System.out.println(daysInMonth);
        }
        else {
            daysInMonth = notLeapMonth[monthNumber-1];
            System.out.println(daysInMonth);
        }
        return daysInMonth;
    }


}


