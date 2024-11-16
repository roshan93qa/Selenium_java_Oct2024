package Arrays_13_11;

public class skipp_3_7_number {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==3 || arr[i]==7) {
				//If the current element in the array (arr[i]) is either 3 or 7,
				//the continue statement skips the rest 
				//of the code in the loop for that iteration. This means the numbers 3 and 7 will not be printed.
				continue;
				
			}
			System.out.println(arr[i]);
		}

	}

}
