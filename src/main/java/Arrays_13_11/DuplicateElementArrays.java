package Arrays_13_11;

public class DuplicateElementArrays {

	
	    public static void main(String[] args) {
	        int arr[] = {1, 2, 3, 4, 5, 6, 5, 4};
	        boolean flag = false;
	        
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.println("Found duplicate element: " + arr[i]);
	                    flag = true;
	                }
	            }
	        }
	        
	        if (flag==false) {
	            System.out.println("Duplicate element is not found");
	        }
	    }
	}



