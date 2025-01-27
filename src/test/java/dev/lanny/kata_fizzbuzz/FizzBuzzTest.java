package dev.lanny.kata_fizzbuzz;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class FizzBuzzTest {

    @Test
    @DisplayName("Devuelve Fizz si el número es divisible por 3")
    void testIfdivisibleByThree_ReturnFizz() {
     
        int number = 3;
        FizzBuzz fizzbuzz = new FizzBuzz();      
        String result = fizzbuzz.checkNumber(number);
    
        assertThat(fizzbuzz, instanceOf(FizzBuzz.class));
        assertThat(result, is("Fizz"));
    }

    @Test
    @DisplayName("Devuelve Buzz si el número es divisible por 5")
    void testIfdivisibleByFive_ReturnBuzz() {
     
        int number = 5;
        FizzBuzz fizzbuzz = new FizzBuzz();    
        String result = fizzbuzz.checkNumber(number);      

        assertThat(result, is("Buzz"));
    }

    @Test
    @DisplayName("Devuelve FizzBuzz si el número es divisible por 3 y 5")
    void testIfdivisibleByThreeFive_ReturnFizzBuzz() {
       
        int number = 15;
        FizzBuzz fizzbuzz = new FizzBuzz();       
        String result = fizzbuzz.checkNumber(number);     

        assertThat(result, is("FizzBuzz"));
    }

    @Test
    @DisplayName("Devuelve el numero  si no es divisible por 3 y 5")
    void testNotIsdivisibleByThreeOrFive() {
        
        int number = 7;
        FizzBuzz fizzbuzz = new FizzBuzz();       
        String result = fizzbuzz.checkNumber(number);     

        assertThat(result, is("7"));
    }

}
