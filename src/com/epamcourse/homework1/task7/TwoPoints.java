package com.epamcourse.homework1.task7;



import java.util.Scanner;

public class TwoPoints {
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    public double A; //Расстояние точки A до начала координат
    public double B; //Расстояние точки B до начала координат
    public int flag; // 1 - A точка ближе, 2 - B точка дальше, 3 - одинаково близки

    Scanner in = new Scanner(System.in);

    public void getData(){
        System.out.println("Введите x1 для точки А");
        x1 = in.nextDouble();
        System.out.println("Введите y1 для точки А");
        y1 = in.nextDouble();
        System.out.println("Введите x2 для точки B");
        x2 = in.nextDouble();
        System.out.println("Введите y2 для точки B");
        y2 = in.nextDouble();
    }

    public void distanceToPoint(){
        getData();
        A = Math.sqrt((x1*x1)+(y1*y1));
        B = Math.sqrt((x2*x2)+(y2*y2));
    }

    public void pointComparison(){
        distanceToPoint();
        if(A != B) {
              if (A-B<0){
                  flag = 1;
            }
              else{
                  flag =2;
              }
        }
        else {
            flag =3;
        }


    }



    public void run(){
        pointComparison();
        switch (flag){
            case 1: System.out.println("Точка А ближе к началу координат");
                break;
            case 2: System.out.println("Точка B ближе к началу координат");
                break;
            case 3: System.out.println("Обе точки одинаково близки к началу координат");
                break;
        }
    }



}
