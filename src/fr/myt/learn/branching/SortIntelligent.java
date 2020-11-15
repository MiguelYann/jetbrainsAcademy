package fr.myt.learn.branching;

import java.util.*;

class SortIntelligent {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maximum;
        int minimum;
        List<Integer> list = new ArrayList<>();

        buildListFromInputValuesStdIn(scanner, list);

        maximum = list.get(0);
        minimum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maximum) {
                maximum = list.get(i);
                continue;
            }
            if (list.get(i) < minimum) {
                minimum = list.get(i);
            }
        }

        printStatement(maximum, minimum, list);
    }

    private static void printStatement(int maximum, int minimum, List<Integer> list) {
        int lastIndex = list.size() - 1;
        Integer lastElement = list.get(lastIndex);
        boolean ascendantOrder = list.get(0) == minimum && (lastElement == maximum);
        boolean descendantOrder = list.get(0) == maximum && (lastElement == minimum);
        System.out.println(ascendantOrder || descendantOrder);
    }

    private static void buildListFromInputValuesStdIn(Scanner scanner, List<Integer> list) {
        while (scanner.hasNext()) {
            int currentValue = scanner.nextInt();

            if (currentValue == 0) {
                break;
            } else {
                list.add(currentValue);
            }
        }
    }
}

