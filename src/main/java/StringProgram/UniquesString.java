package StringProgram;

public class UniquesString {

	public static void main(String[] args) {
		String s="javajavajavadevdevdev";
		String un="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(un.indexOf(ch)==-1) {
				un=un+ch;
			}
		}
			System.out.println("uniques string is==>"+un);	

	}

}
