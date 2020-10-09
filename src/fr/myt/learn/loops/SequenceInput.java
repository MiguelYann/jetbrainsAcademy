package fr.myt.learn.loops;

import java.util.Scanner;

import static java.lang.Integer.*;

public class SequenceInput {

    public void getMaximumOf() {

        Scanner scanner = new Scanner(System.in);
        int maximum = 0;
        String inputValue;
        int convertInputValue;

        do {
            inputValue = scanner.next();
            convertInputValue = parseInt(inputValue);
            maximum = Math.max(convertInputValue, maximum);
        } while (convertInputValue != 0);
        System.out.print(maximum);
    }
}
