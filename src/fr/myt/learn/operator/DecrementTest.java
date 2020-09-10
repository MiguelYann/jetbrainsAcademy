package fr.myt.learn.operator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class DecrementTest {

    private final Decrement decrement = new Decrement();


    @Test
    public void should_decrement_fourNumbers() {

        //Given
        String input = "10 -140 1 104";
        String expected = "9 -141 0 103";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrayInputStream);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);


        //When
        decrement.subtractByOne();

        //Then
        Assertions.assertEquals(expected, outputStream.toString());
    }

}