package Arrays;

import java.util.Arrays;

public class Interview_1_1_2_3_9_0 {

	public static void main(String[] args) {
		int[] num = { 1, 2, 9 };
		int[] result = incrementToLargestNumber(num);
		System.out.println("Output: " + Arrays.toString(result));
	}

	public static int[] incrementToLargestNumber(int[] num) {
		for (int i = num.length - 1; i >= 0; i--) {
			
			if (num[i] < 9) {
				num[i]++; // Increase the number
				
				
				for (int j = i + 1; j < num.length; j++) {
					num[j] = 0; // Set right numbers to zero
				}
				return num;
			}
		}

		// If all numbers are 9, make a new list like {1, 0, 0, 0}
		int[] newDigits = new int[num.length + 1];
		newDigits[0] = 1;
		return newDigits;
	}

}
