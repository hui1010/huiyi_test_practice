package se.lexicon;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
    public double a = 10, b = 5;

    /**
     * test if + works
     */
    @Test
    public void given_plus_return_true() {
        char operator = '+';
        double expectedResult = 15;
        double actualResult = App.calculate(operator, a, b);
        Assert.assertTrue(expectedResult == actualResult);
    }


    /**
     * test if - works
     */
    @Test
    public void given_minus_return_true() {
        char operator = '-';
        double expectedResult = 5;
        double actualResult = App.calculate(operator, a, b);
        Assert.assertTrue(expectedResult == actualResult);
    }


    /**
     * test if * works
     */
    @Test
    public void given_multiply_return_true() {
        char operator = '*';
        double expectedResult = 50;
        double actualResult = App.calculate(operator, a, b);
        Assert.assertTrue(expectedResult == actualResult);
    }


    /**
     * test if / works
     */
    @Test
    public void given_divide_return_true() {
        char operator = '/';
        double expectedResult = 2;
        double actualResult = App.calculate(operator, a, b);
        Assert.assertTrue(expectedResult == actualResult);
    }

}
