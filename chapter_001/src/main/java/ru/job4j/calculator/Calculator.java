package ru.job4j.calculator;

/**
 * Simple calculator.
 *
 * @author Artem Vukolov (avukolov@me.com)
 * @version $Id
 * @since 29.11.2017
 */

public class Calculator {

    private double result;

    public void add(double first, double second) {
        this.result = first + second;
    }

    public void subtract(double first, double second) {
        this.result = first - second;
    }

    public void div(double first, double second) {
        this.result = first / second;
    }

    public void multiple(double first, double second) {
        this.result = first * second;
    }

    public double getResult() {
        return this.result;
    }
}
