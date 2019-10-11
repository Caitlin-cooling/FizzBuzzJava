package com.caitlin;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void play_whenPassedNumber7_returns7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(7);
        assertEquals("7", result);
    }


}