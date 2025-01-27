package dev.lanny.kata_fizzbuzz;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        FizzBuzz fizzbuzz = new FizzBuzz();

        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzbuzz.checkNumber(i));
        }
        System.out.println("Fin del programa FizzBuzz!");
    }
}
