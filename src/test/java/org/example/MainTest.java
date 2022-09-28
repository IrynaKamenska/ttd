package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void convertToStringTest(){
        // given
        int number = 4;

        // when
        String actual = Main.fizzBuzz(number);

        //then
        String expected = "4";
        assertEquals(expected, actual);
    }

}