package ua.lviv.lgs;

public class Min_Max_values {

	public static void main(String[] args) {
		
		int [] array = {23, 5, -54, 148, 32, -7, -53, 346, 0, -1};
		
		int min = array[0];
		int max = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println("min = " + min);
		System.out.println("max = " + max);
		
	}
	
}
