package com.epamcourse.homework1.task10;

import java.util.Scanner;

public class SegmentFunction {
    public double a;
    public double b;
    public double h;
    public double Fx;

    Scanner in = new Scanner(System.in);

    public  void getData(){
        System.out.println("Введите отрезок от а до b");
        System.out.print("Введите а ");
        a = in.nextDouble();
        System.out.print("Введите b ");
        b = in.nextDouble();
        System.out.print("Введите шаг h ");
        h = in.nextDouble();
    }

    public void run(){
        getData();
        System.out.println("    x                  f(x)");

        while (a < b){
            System.out.println("    " + a +"           " + Math.tan(a) );
            System.out.print("Аргумент: " + a);
            System.out.println("F(x) = " + Math.tan(a));
            a += h;
        }
    }

}
