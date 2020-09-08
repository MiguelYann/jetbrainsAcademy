package fr.myt.learn.operator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Integer.parseInt;
import static java.lang.String.*;

public class Reversing {
    public static int reverseDigits(int aNumber) {
        String convertDigit = valueOf(aNumber);

        List<String> charactersOfDigit = new ArrayList<>();

        for (int i = 0; i < convertDigit.length(); i++) {
            charactersOfDigit.add(valueOf(convertDigit.charAt(i)));
        }

        Collections.reverse(charactersOfDigit);
        convertDigit = join("", charactersOfDigit);

        return parseInt(convertDigit);
    }
}
