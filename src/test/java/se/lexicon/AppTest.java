package se.lexicon;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void given_operator_return_true_0() {
        int a = 10, b = 5, result = 0;
        char operator = '+';
        result = a + b;
        Assert.assertFalse(result != 15);
    }

    @Test
    public void given_operator_return_true_1() {
        int a = 10, b = 5, result = 0;
        char operator = '-';
        result = a - b;
        Assert.assertFalse(result != 5);
    }

    @Test
    public void given_operator_return_true_2() {
        int a = 10, b = 5, result = 0;
        char operator = '*';
        result = a * b;
        Assert.assertFalse(result != 50);
    }

    @Test
    public void given_operator_return_true_3() {
        int a = 10, b = 5, result = 0;
        char operator = '/';
        result = a / b;
        Assert.assertFalse(result != 2);
    }

}
