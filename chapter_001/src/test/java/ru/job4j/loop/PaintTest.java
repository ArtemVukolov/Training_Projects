package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Построить пирамиду в псевдографике Тест.
 *
 * @author Artem Vukolov (avukolov@me.com)
 * @version $Id
 * @since 04.12.2017
 */

public class PaintTest {
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        final String line = System.getProperty("line.separator");
        String expected = String.format(" ^ %s^^^", line);
        assertThat(result, is(expected));
    }

    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
        Paint paint = new Paint();
        String result = paint.piramid(3);
        final String line = System.getProperty("line.separator");
        String expected = String.format("  ^  %s ^^^ %s^^^^^", line, line);
        assertThat(result, is(expected));
    }

}
