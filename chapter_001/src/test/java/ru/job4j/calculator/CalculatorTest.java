package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Simple calculator Test.
 *
 * @author Artem Vukolov (avukolov@me.com)
 * @version $Id
 * @since 29.11.2017
 */

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSubtractOneMinusThenTwo() {
        Calculator calc = new Calculator();
        calc.subtract(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenDivOneDivisionThenTwo() {
        Calculator calc = new Calculator();
        calc.div(16D, 4D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMultipleOneMultiplicationThenTwo() {
        Calculator calc = new Calculator();
        calc.multiple(5D, 5D);
        double result = calc.getResult();
        double expected = 25D;
        assertThat(result, is(expected));
    }
}
