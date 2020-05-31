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
        this.year = in.nextInt();

        return this.year;

    }
    public int enterMonth() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the month number");
        this.monthNumber = in.nextInt();

        return this.monthNumber;

    }

    public boolean checkForLeap() {

        if (this.year % this.HUNDRED == 0 && this.year % this.FOUR_HUNDRED == 0) {
            System.out.println("number of days per year: 366");
            return this.leap = true;

        } else if (this.year % this.FOUR == 0 && this.year % this.HUNDRED > 0) {
            System.out.println("number of days per year: 366");
            return this.leap = true;

        } else if (this.year % this.HUNDRED == 0) {
            System.out.println("number of days per year: 365");
            return this.leap = false;

        } else {
            System.out.println("number of days per year: 365");
            return this.leap = false;
        }

    }

    public int run() {
        System.out.print("amount of days in this month: ");

        if (this.leap == true) {
        this.daysInMonth = this.leapMonth[this.monthNumber-1];
            System.out.println(daysInMonth);
        }
        else {
            this.daysInMonth = this.notLeapMonth[this.monthNumber-1];
            System.out.println(daysInMonth);
        }
        return this.daysInMonth;
    }


}


