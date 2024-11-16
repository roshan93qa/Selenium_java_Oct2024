package Arrays;

public class AvgArrays {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,4,6};
		int sum=0;
		int avg=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			avg=sum/arr.length;
		}
		System.out.println(sum);
		System.out.println(avg);

	}

}
