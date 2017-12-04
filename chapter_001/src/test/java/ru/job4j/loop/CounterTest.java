package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * // Подсчет суммы чётных чисел в диапазоне Тест.
 *
 * @author Artem Vukolov (avukolov@me.com)
 * @version $Id
 * @since 04.12.2017
 */

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
    Counter counter = new Counter();
    int result = counter.add(0, 10);
    assertThat(result, is(30));
    }

}
