package com.epamcourse.homework2.console;

import java.util.ArrayList;

public class NumberLinesEcho {
    public void echoInLine(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.print("\n");
    }

    public void echoWithNewLine(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}