package lesson01.homework;

import java.util.Random;


public class CheckExist {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Loop №" + (i + 1));
			checkExist();
		}
	}

	private static void checkExist() {
		Random random = new Random();
		boolean flag = false;
		int BOUND = 1000000000;
		int[] array = new int[random.nextInt(BOUND)];
		System.out.println("Array's length = " + array.length);
		for(int i = 0; i < array.length; i++){
			array[i] = random.nextInt(BOUND);
		}
		for(int i = 0; !flag && i < array.length; i++) {
			if(array[i] == 0){
				flag = true;
				System.out.println("Index of zero equals element - " + i);
			}
		}
		System.out.println(flag? "Zero equals element found" : "All elements is non-zero");
	}
}	