package fr.myt.learn.branching;

import java.util.*;

public class BusTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heightOfBus = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        boolean isCrashed = true;
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        for (int i = 0; i < numberOfBridges; i++) {
            if (list.get(i) <= heightOfBus) {
                System.out.println("Will crash on bridge " + (i + 1));
                isCrashed = true;
                break;
            } else {
                isCrashed = false;
            }
        }

        if (!isCrashed) {
            System.out.println("Will not crash");
        }

    }
}

