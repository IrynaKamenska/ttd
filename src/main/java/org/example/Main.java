package org.example;

public class Main {
    public static String fizzBuzz(int number) {
        if(isDivisibleBy3(number) && isDivisibleBy5(number)){
            return "fizzbuzz";
        }
        else if(isDivisibleBy3(number)){
            return "fizz";
        } else if (isDivisibleBy5(number)) {
            return "buzz";
        }
        return String.valueOf(number);
    }



    public static boolean isDivisibleBy3(int number){
        return (number % 3 == 0);
    }

    public static boolean isDivisibleBy5(int number){
        return (number % 5 == 0);
    }
}