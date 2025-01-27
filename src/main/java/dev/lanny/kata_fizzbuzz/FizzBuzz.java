package dev.lanny.kata_fizzbuzz;

public class FizzBuzz {
    public String checkNumber(int number) {

        boolean isDivisibleByThree = number % 3 == 0;
        boolean isDivisibleByFive = number % 5 == 0;

        if (isDivisibleByThree && isDivisibleByFive) {
            return "FizzBuzz";
        } else if (isDivisibleByThree) {
            return "Fizz";
        } else if (isDivisibleByFive) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }

    };

}
