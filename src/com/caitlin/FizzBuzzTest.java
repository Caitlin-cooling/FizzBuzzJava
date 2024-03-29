package com.caitlin;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
         fizzBuzz = new FizzBuzz();
    }

    @Test
    public void play_whenPassedNumber7_returns7() {
        String result = fizzBuzz.play(7);
        assertEquals("7", result);
    }

    @Test
    public void play_whenPassedNumber15_returnsFizzBuzz() {
        String result = fizzBuzz.play(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void play_whenPassedNumber3_returnsFizz() {
        String result = fizzBuzz.play(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void play_whenPassedNumber5_returnsBuzz() {
        String result = fizzBuzz.play(5);
        assertEquals("Buzz", result);
    }
}