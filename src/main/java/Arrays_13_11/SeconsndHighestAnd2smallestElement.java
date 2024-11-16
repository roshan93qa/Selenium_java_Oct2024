package Arrays_13_11;

public class SeconsndHighestAnd2smallestElement {

	public static void main(String[] args) {
		int arr[]= {22,5,6,88,9};
		int max=arr[0];
		int secmax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}else if(arr[i]>secmax) {
				secmax=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(secmax);

	}

}
