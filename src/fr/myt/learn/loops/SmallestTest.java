package fr.myt.learn.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

class SmallestTest {

    public static final long EXPECTED = 13;
    private Smallest smallest;

    @BeforeEach
    void setup() {
        smallest = new Smallest();
    }

    @Test
    void should_minimum_number() {

        //Given
        String givenValue = "6188989133";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(givenValue.getBytes());
        System.setIn(byteArrayInputStream);

        //when
        long smallestValueFactoriel = smallest.getSmallestValueFactoriel();

        //Then
        Assertions.assertEquals(EXPECTED, smallestValueFactoriel);
    }
}