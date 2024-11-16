package String_29_10;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	  String s1="LISTEN";
	  String s2="SILENT";
	  char ch1[]=s1.toLowerCase().toCharArray();
	  char ch2[]=s1.toLowerCase().toCharArray();
	  Arrays.sort(ch1);
	  Arrays.sort(ch2);
	  
	  if(Arrays.equals(ch1, ch2)) {
		  System.out.println("The Two String Is Anagram");
	  }else {
		  System.out.println("The Two String Is not Anagram");
	  }
	  
	}

}
