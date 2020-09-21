package fr.myt.learn.conditional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {

    @Test
    public void should_2000_leap() {
        assertTrue(Year.isLeap(2000));
    }


    @Test
    public void should_2100_Notleap() {
        assertFalse(Year.isLeap(2100));
    }

}