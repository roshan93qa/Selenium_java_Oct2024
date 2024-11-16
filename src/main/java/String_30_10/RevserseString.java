package String_30_10;

public class RevserseString {

	public static void main(String[] args) {
		String s = "roshan";
		String rev = "";
	    for(int i = s.length() - 1; i >= 0; i--) {  // Changed i > 0 to i >= 0
		        char c = s.charAt(i);
		        rev = rev + c;
		    }

		    System.out.println(rev);  // Removed the extra 'c'
		    System.out.print(rev);
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i=s.length()-1;i>0;i--) {
//			char c = s.charAt(i);
//			rev = rev+c;
//		}
//		
//		System.out.println(rev);
//		System.out.print(rev);
//		
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			rev = c + rev;
//		}
//		System.out.println(rev);
//		System.out.print(rev);
	}


