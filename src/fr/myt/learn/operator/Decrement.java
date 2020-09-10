package fr.myt.learn.operator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Decrement {
    public void subtractByOne() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNext()) {
            Integer aNumber = Integer.valueOf(scanner.next());
            --aNumber;
            numbers.add(aNumber);
        }
        numbers.forEach(num -> System.out.print(num + " "));
    }
}
