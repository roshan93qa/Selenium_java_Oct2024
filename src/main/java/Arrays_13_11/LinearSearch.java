package Arrays_13_11;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		int search=90;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(search==arr[i]) {
				System.out.println("Element is found "+arr[i]);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Element is  not found");
		}
		

	}

}
