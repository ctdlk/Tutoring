package lesson01.homework;

import java.util.Random;


public class Count {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("Loop №" + (i + 1));
            count();
            System.out.println();
        }
    }

    private static void count() {
        Random random = new Random();
        int BOUND = 1000000000;
        int posCounter = 0;
        int negCounter = 0;
        int zeroCounter = 0;
        int[] array = new int[random.nextInt(BOUND)];
        System.out.println("Array's length = " + array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        for (int i : array) {
            if (i > 0) {
                posCounter++;
            } else if (i < 0) {
                negCounter++;
            } else {
                zeroCounter++;
            }
        }
        System.out.println("Positive elements quantity = " + posCounter);
        System.out.println("Negative elements quantity = " + negCounter);
        System.out.println("Zero equals elements quantity = " + zeroCounter);
    }
}	