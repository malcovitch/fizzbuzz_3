package com.malcolm.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzLauncher {

    private List<String> results = new ArrayList<>();

    public void go(int lowerLimit, int upperLimit) {
       FizzBuzzProcessor fizzBuzzProcessor = FizzBuzzProcessorFactory.getFizzBuzzProcessor(FizzBuzzProcessorFactory.FizzBuzzProcessorType.LUCKY);
       for (int i = lowerLimit; i <= upperLimit; i++) {
           String result = fizzBuzzProcessor.process(i);
           results.add(result);
           System.out.println(result);
       }
        long fizzCount = results.stream().filter(r -> r.equalsIgnoreCase(FizzBuzzProcessor.FizzBuzzEnum.FIZZ.name())).count();
        long buzzCount = results.stream().filter(r -> r.equalsIgnoreCase(FizzBuzzProcessor.FizzBuzzEnum.BUZZ.name())).count();
        long luckyCount = results.stream().filter(r -> r.equalsIgnoreCase(FizzBuzzLuckyProcessor.LUCKY)).count();
        System.out.println("Fizz count: " + fizzCount);
        System.out.println("Buzz count: " + buzzCount);
        System.out.println("Lucky count: " + luckyCount);
    }

}
