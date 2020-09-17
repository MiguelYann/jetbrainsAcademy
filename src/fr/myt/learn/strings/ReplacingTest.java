package fr.myt.learn.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static fr.myt.learn.strings.Replacing.transfromByB;
import static org.junit.jupiter.api.Assertions.*;

class ReplacingTest {

    @Test
    public void should_not_replace_input_does_not_have_a_letterA() {
        //Given
        String givenInput = "derk";


        //When
        String result = transfromByB(givenInput);

        //then
        Assertions.assertEquals(givenInput, result);

    }

    @Test
    public void should_replace_all_characters_A_by_B() {
        //Given
        String givenInput = "aalimart";


        //When
        String result = transfromByB(givenInput);

        //Then
        assertTrue(result.contains("b") && result.contains("b"));


    }

}