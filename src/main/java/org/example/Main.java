package org.example;

public class Main {
    public static String fizzBuzz(int number) {
        if(isFizz(number) && isBuzz(number)){
            return "fizzbuzz";
        }
        else if(isFizz(number)){
            return "fizz";
        } else if (isBuzz(number)) {
            return "buzz";
        }
        return String.valueOf(number);
    }



    public static boolean isFizz(int number){
        return number % 3 == 0;
    }

    public static boolean isBuzz(int number){
        return number % 5 == 0;
    }
}