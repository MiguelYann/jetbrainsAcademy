package fr.myt.learn.loops;

public class FizzBuzz {

    public static void compute(int startOfRange, int endOfRange) {
        for (int i = startOfRange; i <= endOfRange; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
