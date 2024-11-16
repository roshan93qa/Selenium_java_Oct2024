package Arrays_p1;

public class MimAndMaxElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
