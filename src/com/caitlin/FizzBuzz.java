package com.caitlin;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("Hello World");
        play(7);
        play(9);
        play(10);
        play(30);
    }

    public static String play(Integer number) {
        if (check15(number)) {
            return "FizzBuzz";
        } else if (check3(number))  {
             return "Fizz";
         } else if (check5(number)) {
            return"Buzz";
        } else {
            return String.valueOf(number);
        }
    }

    public static Boolean check15(Integer number) {
        Boolean result = number % 15 == 0 ? true : false;
        return result;
    }

    public static Boolean check3(Integer number) {
        Boolean result = number % 3 == 0 ? true : false;
        return result;
    }

    public static Boolean check5(Integer number) {
        Boolean result = number % 5 == 0 ? true : false;
        return result;
    }
}

