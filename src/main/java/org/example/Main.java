package org.example;

public class Main {
    public static String fizzBuzz(int number) {
        if(isDivisible(number, 15)){
            return "fizzbuzz";
        }
        else if(isDivisible(number, 3)){
            return "fizz";
        } else if (isDivisible(number, 5)) {
            return "buzz";
        }
        return String.valueOf(number);
    }


    public static boolean isDivisible(int number, int divisor){
        return number % divisor == 0;
    }
}