package com.malcolm.fizzbuzz;

public class FizzBuzzBasicProcessor extends FizzBuzzProcessor {

    public String process(int i) {
        if (i % (FizzBuzzEnum.FIZZ.getDivisor() * FizzBuzzEnum.BUZZ.getDivisor()) == 0) {
            return FizzBuzzEnum.FIZZ.getOutput() + FizzBuzzEnum.BUZZ.getOutput();
        } else if (i % FizzBuzzEnum.FIZZ.getDivisor() == 0) {
            return FizzBuzzEnum.FIZZ.getOutput();
        } else if (i % FizzBuzzEnum.BUZZ.getDivisor() == 0) {
            return FizzBuzzEnum.BUZZ.getOutput();
        }
        return new String() + i;
    }
}
