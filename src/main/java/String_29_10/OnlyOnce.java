package String_29_10;

import org.checkerframework.checker.units.qual.s;

public class OnlyOnce {

	public static void main(String[] args) {
		String s="javajavajavadevdevdev";
		String un="";
		for(int i=0;i<s.length();i++) {
			   char ch=s.charAt(i);
			   if(un.indexOf(ch)==-1) {
				   un=un+ch;
			   }}
		System.out.println("unique string is "+un);
	}

}
