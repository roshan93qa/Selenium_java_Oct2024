package StringConcept;

public class IsNullAndIsEmpty {

	public static void main(String[] args) {
		String s="------Welcome to java";
		String s1="     ";
		String s2="";
		String s3=null;
		//===============================
		System.out.println(s.isBlank());//false
		System.out.println(s1.isBlank());//true
		System.out.println(s2.isBlank());//true
		//System.out.println(s3.isBlank());
		//===============================
		System.out.println(s.isEmpty());//false
		System.out.println(s1.isEmpty());//false
		System.out.println(s2.isEmpty());//true
		//System.out.println(s3.isEmpty());
	}

}
