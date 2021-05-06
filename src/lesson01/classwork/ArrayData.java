package lesson01.classwork;

import java.util.Random;


public class ArrayData {
	public static void main(String[] args) {
		int SIZE = 10;
		Random random = new Random();
		int[] array = new int[SIZE]; // создаю массив
		for(int i = 0; i < SIZE; i++){
			boolean sgn = random.nextBoolean();
			array[i] = random.nextInt(20); // заполняю от 0,0 (включительно) до 1 (не включая)
			System.out.println("new int = " + array[i]);
			array[i] = sgn ? array[i] : -1 * array[i];
			System.out.println("array[" + i + "] = " + array[i]);
		}
		
		int min = array[0];
		double avg = 0;
		int max = array[0];
		
		for(int x : array) {
			if(x < min) {
				min = x;
			}
			if(x>max){
				max = x;
			}
			avg += x;
			System.out.println("x = " + x);
		}
		
		
		
		System.out.println("Max = " + max);
		System.out.println("avg = " + avg/SIZE);
		System.out.println("Min = " + min);
	}
}