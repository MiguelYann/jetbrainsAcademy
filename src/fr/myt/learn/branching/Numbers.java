package fr.myt.learn.branching;

import java.util.Scanner;

public class Numbers {

    public void getStatutOf() {
        StringBuilder report = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int valueInput;
        while (scanner.hasNext()) {
            valueInput = scanner.nextInt();
            if (valueInput == 0) {
                break;
            }
            report.append(reportOddEvenOf(valueInput)).append("\n");
        }

        System.out.println(report);

    }

    private String reportOddEvenOf(int inputValue) {
        return inputValue % 2 == 0 ? "Even" : "Odd";
    }
}
