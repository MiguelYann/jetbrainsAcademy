package fr.myt.learn.loops;

import java.util.Scanner;

import static java.lang.Long.parseLong;

public class Smallest {


    public long getSmallestValueFactoriel() {

        Scanner scanner = new Scanner(System.in);
        long valueInput = parseLong(scanner.next());
        long i = 1;
        while(i < valueInput) {
            if(getFactoriel(i) > valueInput){
                return i;
            }
            i++;
        }
        return 0;
    }

    private long getFactoriel(long aNumber) {
        long factoriel = 1;
        while (aNumber > 0) {
            factoriel *= aNumber--;
        }
        return factoriel;
    }
}
