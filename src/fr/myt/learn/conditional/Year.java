package fr.myt.learn.conditional;

public class Year {

    public static boolean isLeap(int anYear) {
        return ((anYear%4 == 0) && (anYear%100!=0)) || (anYear %400 == 0);
    }
}
