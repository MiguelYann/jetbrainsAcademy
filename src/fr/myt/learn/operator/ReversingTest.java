package fr.myt.learn.operator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
* Change case of test with parameterize for many value
* */
class ReversingTest {

    @Test
    public void shouldReturnReverseDigit() {
        //Given

        int theDigit = 320;
        int anotherDigit = 976;


        //When

       int theResultDigit =  Reversing.reverseDigits(theDigit);
       int theResultOfAnotherDigit =  Reversing.reverseDigits(anotherDigit);

        //then

        Assertions.assertEquals(23, theResultDigit);
        Assertions.assertEquals(679, theResultOfAnotherDigit);
    }

}