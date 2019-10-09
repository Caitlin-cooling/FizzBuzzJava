package com.caitlin;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        play(7);
        play(9);
        play(10);
        play(30);
    }

    public static void play(Integer number) {
        if (check15(number)) {
            System.out.println("FizzBuzz");
        } else if (check3(number))  {
             System.out.println("Fizz");
         } else if (check5(number)) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }

    public static Boolean check15(Integer number) {
        if (number % 15 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean check3(Integer number) {
        if (number % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean check5(Integer number) {
        if(number % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

