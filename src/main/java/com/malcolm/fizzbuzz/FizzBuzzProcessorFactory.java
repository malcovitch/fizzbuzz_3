package com.malcolm.fizzbuzz;

public class FizzBuzzProcessorFactory {

    public enum FizzBuzzProcessorType {
        BASIC,
        LUCKY
    }

    public static FizzBuzzProcessor getFizzBuzzProcessor(FizzBuzzProcessorType fizzBuzzProcessorType) {
        switch (fizzBuzzProcessorType) {
            case BASIC:
                return new FizzBuzzBasicProcessor();
            case LUCKY:
                return new FizzBuzzLuckyProcessor();
            default:
                throw new EnumConstantNotPresentException(FizzBuzzProcessorType.class, fizzBuzzProcessorType.name());
        }
    }
}
