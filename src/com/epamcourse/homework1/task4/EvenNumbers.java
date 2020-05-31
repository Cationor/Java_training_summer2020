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

    public int[] getData() {
        System.out.println("enter A");
        A = in.nextInt();
        System.out.println("enter B");
        B = in.nextInt();
        System.out.println("enter C");
        C = in.nextInt();
        System.out.println("enter D");
        D = in.nextInt();
        numbers[0] = A;
        numbers[1] = B;
        numbers[2] = C;
        numbers[3] = D;
        return numbers;
    }

    public int checkEven() {
        getData();
        for (int i = 0; i < 4; i++) {
            if (numbers[i] % 2 == 0) {
                numberOfEven++;
            }
        }
        return numberOfEven;
    }

    public void run() {
        if (checkEven() >= 2) {
            flag = true;
            System.out.println(flag);
        } else {
            System.out.println(flag);
        }
    }
}

