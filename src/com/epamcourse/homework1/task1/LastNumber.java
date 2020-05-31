package com.epamcourse.homework1.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LastNumber {
    public int number;
    public int divider = 10; // 10 - это наш делитель, благодаря которому
                             // мы получим остаток => последнее число квадрата
    public int degree = 2;
    public int square;


    Scanner in = new Scanner(System.in);


    public int getData() {
        System.out.print("Enter your number ");

        try {
            number = in.nextInt();

        }
        catch(InputMismatchException e ) {
            System.out.println("The value you enter must be an integer\n");
            throw e;

        }
         return number;
    }

    public void run() {
        getData();
        System.out.printf("The last digit of the square of your number is ");
        int square = ((int) Math.pow(number, degree) % divider);
        System.out.println(square);
    }



}
