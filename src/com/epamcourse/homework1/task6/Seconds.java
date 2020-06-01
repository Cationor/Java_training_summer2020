package com.epamcourse.homework1.task6;

import java.util.Scanner;

public class Seconds {
    public double second;
    public double sixty = 60; // Эти 60 нам помогут приводить секунды к часам, минутам
    public double threeThousandSixHundred = sixty*sixty;
    public double minute;
    public double hour;
    public double A; //остаток от часов
    public double B; //остаток от минут (

Scanner in = new Scanner(System.in);
public double getData() {
    System.out.println("Enter the number of seconds");
    second = in.nextInt();
    return second;
}
public void run(){
    getData();
    A  = second % threeThousandSixHundred;// остаток от часов
    hour = ((second - A) / sixty*sixty) / threeThousandSixHundred;
    B = A % sixty; // остаток от минут
    minute = ((A-B) / sixty);
    second = B;
    System.out.println("To this moment has passed " + hour + " hour " + minute + " minute and " + second + " second");


}
}
