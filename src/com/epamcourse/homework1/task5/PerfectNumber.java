package com.epamcourse.homework1.task5;

import java.io.PrintWriter;
import java.util.Scanner;

public class PerfectNumber {
    public int a;
    Scanner in = new Scanner(System.in);

    public void run()  {


        System.out.println("Enter an integer");
        a= in.nextInt();

        if(sum(a)) {
            System.out.println("The number is perfect");
        } else {
            System.out.println("The number is not perfect");
        }


    }
    static boolean sum(int n) {
        int summa =0;
        for(int i=1;i<n;i++) {
            if(n%i==0) {
                summa+=i;
            }
        }

        return summa == n;

    }
}
