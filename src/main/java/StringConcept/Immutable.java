package StringConcept;

public class Immutable {

	public static void main(String[] args) {
		String s="Hello";
		String s1="Hello";
		String s2="hello";
		System.out.println(s==s1);//true
		System.out.println(s1==s2);//false
		
		System.out.println(s.equals(s2));//false
		
		String sr1=new String("hello");
	    System.out.println(s2==sr1);//false
	    System.out.println(s2.equals(sr1));//true4
		
	}

}
