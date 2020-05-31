package com.epamcourse.homework1.task4;

import java.util.Scanner;

public class EvenNumbers {
    boolean dividesByTwo;
    public int A;
    public int B;
    public int C;
    public int D;
    int numbers[] = new int[4];
    int numberOfEven;
    boolean flag;

    Scanner in = new Scanner(System.in);

    public int[] getData(int a, int b, int c, int d) {
        numbers[0] = this.A;
        numbers[1] = this.B;
        numbers[2] = this.C;
        numbers[3] = this.D;
        return numbers;
    }

    public int checkEven() {
        for (int i = 0; i < 4; i++) {
            if (getData(A, B, C, D)[i] % 2 == 0) {
                this.numberOfEven++;
            }
        }
        return numberOfEven; //убрать this
    }

    public void run() {
        System.out.println("enter A");
        this.A = in.nextInt();
        System.out.println("enter B");
        this.B = in.nextInt();
        System.out.println("enter C");
        this.C = in.nextInt();
        System.out.println("enter D");
        this.D = in.nextInt();
        if (this.checkEven() >= 2) {
            this.flag = true;
            System.out.println(this.flag);
        } else {
            System.out.println(this.flag);
        }
    }
}

