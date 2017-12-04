package ru.job4j.loop;

/**
 * Построить пирамиду в псевдографике.
 *
 * @author Artem Vukolov (avukolov@me.com)
 * @version $Id
 * @since 04.12.2017
 */

public class Paint {
    public String piramid(int h) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= ((h * 2) - 1); j++) {
                if (j < (h - i) + 1 || j > (h + i) - 1) {
                    builder.append(" ");
                } else {
                    builder.append("^");
                }
            }
            if (i < h) {
                builder.append(System.getProperty("line.separator"));
            }
            }
        return builder.toString();
    }
}
