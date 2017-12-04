package ru.job4j.loop;

/**
 * // Построить шахматную доску в псевдографике.
 *
 * @author Artem Vukolov (avukolov@me.com)
 * @version $Id
 * @since 04.12.2017
 */

public class Board {
    public String paint(int width, int height) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if ((i + j) % 2 == 0) {
                    builder.append("X");
                } else {
                    builder.append(" ");
                }
            }
            builder.append(System.getProperty("line.separator"));
        }
        String completedString = builder.toString();
        return completedString;
    }
}
