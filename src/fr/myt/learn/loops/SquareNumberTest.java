package fr.myt.learn.loops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SquareNumberTest {
    private SquareNumber squareNumber;

    @BeforeEach
    void setup() {
        squareNumber = new SquareNumber();
    }

    @Test
    void should_print_square_of_numbers_inferior_input() {

        //Given

        String givenValue = "5";

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(givenValue.getBytes());
        System.setIn(byteArrayInputStream);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);

        //When
        squareNumber.printSquareOfDescendentNumber();

        //Then
        assertEquals("1 4", byteArrayOutputStream.toString());
    }

}