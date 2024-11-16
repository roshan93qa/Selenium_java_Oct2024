package StringProgram;

public class CountCharWithoutSpace1 {

	public static void main(String[] args) {
		String s="I AM JAVA DEVELOPER";
		System.out.println(s.length());
		String s1 = s.replaceAll(" ", "");
		System.out.println(s1.length());
		
		

	}

}
