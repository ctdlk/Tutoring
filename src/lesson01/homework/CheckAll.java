package lesson01.homework;

import java.util.Random;


public class CheckAll {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Loop №" + (i + 1));
            checkAll();
			System.out.println();
        }
    }

    private static void checkAll() {
        Random random = new Random();
        boolean flag = true;
        int BOUND = 1000000000;
        int[] array = new int[random.nextInt(BOUND)];
        System.out.println("Array's length = " + array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(BOUND);
        }
        for (int i = 0; flag && i < array.length; i++) {
            if (array[i] == 0) {
                flag = false;
                System.out.println("Index of zero equals element - " + i);
            }
        }
        System.out.println(flag ? "All elements is non-zero" : "Zero equals element found");
    }
}	