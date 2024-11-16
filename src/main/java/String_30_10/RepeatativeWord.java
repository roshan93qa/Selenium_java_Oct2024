package String_30_10;

public class RepeatativeWord {

	public static void main(String[] args) {
		String str="we work to live and live to be live";
		String word1="live";
		check(str, word1);
		
	}
	
	public static void check(String str,String word1) {
		String str1[]=str.split(" ");
		int count=0;
		for(int i=0;i<str1.length;i++) {
			if(word1.equals(str1[i])) {
				count++;
			}
		}
		System.out.println("the repeative "+ word1 + " is "+count );
	}

}
