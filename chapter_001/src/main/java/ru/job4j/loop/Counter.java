package ru.job4j.loop;

/**
 * // Подсчет суммы чётных чисел в диапазоне.
 *
 * @author Artem Vukolov (avukolov@me.com)
 * @version $Id
 * @since 04.12.2017
 */

public class Counter {

    public int add(int start, int finish) {
    int sum = 0;
    for (int i = start; i<= finish; i++) {
        if (i%2 == 0) {
            sum += i;
        }
    }
    return sum;
    }
}
