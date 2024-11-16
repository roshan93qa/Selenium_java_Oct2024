package String_29_10;

public class RepeatativeWord {

	public static void main(String[] args) {
		String str="we live together live to live";
		String word1="live";
		check(str, word1);

	}
	public static void check(String str,String word1) {
		       String s1[]=str.split(" ");
		       int count=0;
		       for(int i=0;i<s1.length;i++) {
		    	   if(word1.equals(s1[i])) {
		    		   count++;
		    	   }
		       }
		System.out.println("the repeatative word "+word1+"=="+count);
		
	}

}
