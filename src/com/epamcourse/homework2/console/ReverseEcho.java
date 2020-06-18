package com.epamcourse.homework2.console;


public class ReverseEcho {
    public void reverseEcho(String[] array) {
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i] + " ");
        }
    }
}