package StringProgram;

public class ReverseString {
	public static void main(String[] args) {
		String s="roshan";
		String rev="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			rev=c+rev;
		}
		System.out.println(rev);
	}
	

}
