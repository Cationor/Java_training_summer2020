package com.epamcourse.homework1.task3;

import java.util.Scanner;

public class SquareAndCircle {
    public double squareArea;
    public double innerSquareArea;
    public double squareDifference = 2;

    Scanner in = new Scanner(System.in);

    public double getData(){
        System.out.println("Enter the square area");
        squareArea = in.nextDouble();
        return squareArea;
    }

    public void run() {
        innerSquareArea = (getData()/squareDifference);
        System.out.println("The area of the inner square " + innerSquareArea);

        System.out.println("The inner square is " + squareDifference +  " times smaller than the outer\n");

    }


}
