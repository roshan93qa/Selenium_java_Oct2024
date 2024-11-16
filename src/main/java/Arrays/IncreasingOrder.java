package Arrays;

import java.util.Arrays;

public class IncreasingOrder {

	public static void main(String[] args) {
		int arr[] = { 4, 2, 3, 1, 7, 9, 6, 8,};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		 System.out.println(Arrays.toString(arr));
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(" " + arr[i]);
//		}
	}

}
