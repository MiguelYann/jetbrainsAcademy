package fr.myt.learn.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class SequenceInputTest {

    private SequenceInput sequenceInput;

    @BeforeEach
    void setUp() {
        sequenceInput = new SequenceInput();
    }

    @Test
    void should_maximum_set_integers() {

        //Given

        String givenNumbers = "1 34 43 2 0";
        String expected = "43";

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(givenNumbers.getBytes());
        System.setIn(byteArrayInputStream);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);


        //when
        sequenceInput.getMaximumOf();


        //then
        Assertions.assertEquals(expected, byteArrayOutputStream.toString());

    }

}