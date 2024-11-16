package Arrays;

public class MaxAndMin {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 6 };
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];

			}}
		System.out.println("max arrays ==>"+max);
		System.out.println("min arrays ==>"+min);
		}

}
