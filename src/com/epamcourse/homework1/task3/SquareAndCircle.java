package com.epamcourse.homework1.task3;

import java.util.Scanner;

public class SquareAndCircle {
    double squareArea;
    double sideLength;
    double innerSquareArea;
    double squareDifference = 2;

    Scanner in = new Scanner(System.in);

    public double getData(){
        System.out.println("Enter the square area");
        this.squareArea = in.nextDouble();
        return this.squareArea;
    }

    public void run() {
        this.innerSquareArea = (this.squareArea/squareDifference);
        System.out.println("The area of the inner square " + this.innerSquareArea);

        System.out.println("The inner square is " + this.squareDifference +  " times smaller than the outer\n");

    }


}
