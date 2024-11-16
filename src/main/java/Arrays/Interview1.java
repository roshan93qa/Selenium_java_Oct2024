package Arrays;

import java.util.Arrays;

public class Interview1 {



	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7};
	        int n = 3;
	        int[] rotatedArray = rotateRight(arr, n);
	        System.out.println("Output: " + Arrays.toString(rotatedArray));
	    }

	    public static int[] rotateRight(int[] arr, int n) {
	        int length = arr.length;
	        n = n % length; // Handle cases where n is bigger than the array length
	        
	        // Combine the last part and first part
	        int[] result = new int[length];
	        System.arraycopy(arr, length - n, result, 0, n);
	        System.arraycopy(arr, 0, result, n, length - n);
	        
	        return result;
	    
	}

}
