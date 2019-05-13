package test;

public class SortTest {
	public static void main(String [] args) {
		printArray(bubbleSort(new int [] {4, 9, 2, 10, 11, 12, 13}));
	}
	
	public static void printArray(int [] array) {
		if (array != null && array.length > 0) {
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
	}
	
	public static int [] bubbleSort(int [] array) {
		if (array != null && array.length > 0) {
			for (int i = 0; i < array.length; i++) {
				boolean flag = true;
				for (int j = 0; j < array.length - i - 1; j++) {
					if (array[j + 1] < array[j]) {
						array[j + 1] = array[j + 1] ^ array[j];
						array[j] = array[j + 1] ^ array[j];
						array[j + 1] = array[j + 1] ^ array[j];
						flag = false;
					}
				}
				System.out.println("i = " + i);
				if (flag) break;
			}
			
		}
		return array;
	}
	
	
}
