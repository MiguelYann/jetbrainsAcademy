package fr.myt.learn.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountDivisibleTest {

    @Test
    public void should_compute() {
        //Given
        int startRange = 10;
        int endRange = 20;
        int divider = 10;

        //When
        long counter = CountDivisible.computeOf(startRange, endRange, divider);

        //Then
        Assertions.assertEquals(2, counter);
    }

}