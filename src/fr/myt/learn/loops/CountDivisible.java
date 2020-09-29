package fr.myt.learn.loops;

import java.util.stream.IntStream;

public class CountDivisible {

    public static long computeOf(int startRange, int endRange, int divider) {
        IntStream stream = IntStream.rangeClosed(startRange, endRange);
        return stream
                .filter(number -> number % divider == 0)
                .count();
    }
}
