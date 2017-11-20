package com.malcolm.fizzbuzz;

public abstract class FizzBuzzProcessor {

    public enum FizzBuzzEnum {

        FIZZ(3, "Fizz"),
        BUZZ(5, "Buzz");

        private int divisor;
        private String output;

        FizzBuzzEnum(int divisor, String output) {
            this.divisor = divisor;
            this.output = output;
        }

        public int getDivisor() {
            return divisor;
        }

        public String getOutput() {
            return output;
        }
    }

    public abstract String process(int i);
}
