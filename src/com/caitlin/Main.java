package com.caitlin;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        play(9);
        play(10);
        play(30);
    }

    public static void play(Integer number) {
        if (check15(number) == "Try again") {
            if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            }
        } else {
            System.out.println(check15(number));
        }
    }

    public static String check15(Integer number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else {
            return "Try again";
        }
    }
}


// If number is divisble by 3 print fizz
// If number is divisble by 5 print buzz
// If number is divisble by 15 print fizzbuzz