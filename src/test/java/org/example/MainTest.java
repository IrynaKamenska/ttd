package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void convert4ToStringTest(){
        // given
        int number = 4;

        // when
        String actual = Main.fizzBuzz(number);

        //then
        String expected = "4";
        assertEquals(expected, actual);
    }

    @Test
    public void convertNumberToString(){
        // given
        int number = 1;

        // when
        String actual = Main.fizzBuzz(number);

        //then
        String expected = "1";
        assertEquals(expected, actual);
    }


    @Test
    public void divisibleBy3(){
        // given
        int number = 9;

        // when
        String actual = Main.fizzBuzz(number);

        // then
        String expected = "fizz";
        assertEquals(expected, actual);
    }

    @Test
    public void divisibleBy5(){
        // given
        int number = 5;

        // when
        String actual = Main.fizzBuzz(number);

        // then
        String expected = "buzz";
        assertEquals(expected, actual);
    }

    @Test
    public void divisibleBy5And3(){
        // given
        int number = 150;

        // when
        String actual = Main.fizzBuzz(number);

        // then
        String expected = "fizzbuzz";
        assertEquals(expected, actual);
    }


}