package org.example;

public class Main {
    public static String fizzBuzz(int number) {
        if(number % 3 == 0){
            return "fizz";
        }
        return String.valueOf(number);
    }
}