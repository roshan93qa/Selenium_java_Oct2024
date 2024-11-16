package String_29_10;

public class ReverseString {
	
	public static void main(String[] args) {
		String str="mom";
	    String rev="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			rev=c+rev;
		}
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("the pallindorme");
		}else {
			System.out.println("Not a pallindrome");
		}
		
	}


}
