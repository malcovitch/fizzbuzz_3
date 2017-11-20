package com.malcolm.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzLuckyProcessorTest {

    private FizzBuzzProcessor fizzBuzzLuckyProcessor = new FizzBuzzLuckyProcessor();

    @Test
    public void process3() throws Exception {
        // Arrange
        int test = 3;
        String expected = "Lucky";

        // Act
        String actual = fizzBuzzLuckyProcessor.process(test);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void process13() throws Exception {
        // Arrange
        int test = 13;
        String expected = "Lucky";

        // Act
        String actual = fizzBuzzLuckyProcessor.process(test);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void process23() throws Exception {
        // Arrange
        int test = 23;
        String expected = "Lucky";

        // Act
        String actual = fizzBuzzLuckyProcessor.process(test);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void process30() throws Exception {
        // Arrange
        int test = 30;
        String expected = "Lucky";

        // Act
        String actual = fizzBuzzLuckyProcessor.process(test);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void process5() throws Exception {
        // Arrange
        int test = 5;
        String expected = FizzBuzzProcessor.FizzBuzzEnum.BUZZ.getOutput();

        // Act
        String actual = fizzBuzzLuckyProcessor.process(test);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void process15() throws Exception {
        // Arrange
        int test = 15;
        String expected = FizzBuzzProcessor.FizzBuzzEnum.FIZZ.getOutput() + FizzBuzzProcessor.FizzBuzzEnum.BUZZ.getOutput();

        // Act
        String actual = fizzBuzzLuckyProcessor.process(test);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void process1() throws Exception {
        // Arrange
        int test = 1;
        String expected = "1";

        // Act
        String actual = fizzBuzzLuckyProcessor.process(test);

        // Assert
        assertEquals(expected, actual);
    }

}