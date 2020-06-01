package com.epamcourse.homework1.task8;

import java.util.Scanner;

public class Function {
    public double x;
    public double fx;
    Scanner in = new Scanner(System.in);

    public void getData(){
        System.out.println("Введите х");
        x = in.nextDouble();
    }

    public void functionCalculation(){
        getData();
        if (x >= 3){
            fx = (x*x) + 3*x + 9;
        }
        else {
            fx = 1 / (Math.pow(x, 3) - 6);
        }
    }
    public void run(){
        functionCalculation();
        System.out.println(fx);
    }

}
