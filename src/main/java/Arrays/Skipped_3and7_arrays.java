package Arrays;

public class Skipped_3and7_arrays {

	public static void main(String[] args) {
	 int arr[]= {1,2,3,4,5,6,7,8};
	 
	 for (int i = 0; i < arr.length; i++) {
         if (arr[i] == 3 || arr[i] == 7) {
             continue; // Skip the numbers 3 and 7
         }
         System.out.println(arr[i]);
     }
 }

	}


