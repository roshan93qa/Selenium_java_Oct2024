package Arrays_13_11;

public class halfAscendingAndHalsDescending {

	public static void main(String[] args) {
		int arr[]= {4,3,2,1,7,8,9,6};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}}
			for(int i=0;i<arr.length/2;i++) {
				System.out.println(" "+arr[i]);
			}
		
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}}
		for(int i=0;i<arr.length/2;i++) {
			System.out.println(" "+arr[i]);
		}
	}

	}


