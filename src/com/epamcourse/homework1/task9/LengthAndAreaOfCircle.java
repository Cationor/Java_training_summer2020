package com.epamcourse.homework1.task9;

import java.util.Scanner;

public class LengthAndAreaOfCircle {
    public double R;
    public double S;
    public double l;

    Scanner in = new Scanner(System.in);

    public void getData(){
        System.out.println("Введите радиус круга");
        R = in.nextDouble();
    }

    public void calculation(){
        getData();
        l = 2*Math.PI*R;
        S = Math.PI*R*R;
    }

    public void run(){
        calculation();
        System.out.println("Длинна окружности равна: " + l + ". Площадь равна: " + S);
    }

}
