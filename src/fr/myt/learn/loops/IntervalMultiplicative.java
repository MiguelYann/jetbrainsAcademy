package fr.myt.learn.loops;

public class IntervalMultiplicative {

    public static long getValueOfProductFrom(int startInterval, int endInterval) {

        long result = 1;

        for (int i = startInterval; i < endInterval; i++) {
            result *= i;
        }

        return result;
    }
}
