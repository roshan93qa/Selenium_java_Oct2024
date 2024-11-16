package Arrays;

public class linearSearch {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,30};
		int search=50;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(search==arr[i]) {
				System.out.println("Elemenet is found:"+arr[i]);
				flag=true;
				
			}
		}
		if(flag==false) {
			System.out.println("Element is not found");
		}

	}

}
