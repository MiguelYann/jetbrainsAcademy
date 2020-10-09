package fr.myt.learn.loops;

import java.util.Scanner;

public class SquareNumber {

    public void printSquareOfDescendentNumber() {

        Scanner scanner = new Scanner(System.in);
        String valueInput = scanner.next();
        int convertInputValue = Integer.parseInt(valueInput);
        int currentInferiorValue = 1;

        while (currentInferiorValue * currentInferiorValue <= convertInputValue) {
            System.out.print(String.format("%d ",currentInferiorValue * currentInferiorValue));
            currentInferiorValue++;
        }
    }
}
