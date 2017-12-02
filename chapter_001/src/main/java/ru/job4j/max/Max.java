package ru.job4j.max;

/**
 * Максимум из двух чисел.
 *
 * @author Artem Vukolov (avukolov@me.com)
 * @version $Id
 * @since 01.12.2017
 */

public class Max {
    public int max(int first, int second) {
    int result = first > second ? first : second;
    return result;
    }
}
