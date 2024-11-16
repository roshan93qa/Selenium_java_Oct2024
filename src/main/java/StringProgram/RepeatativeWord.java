package StringProgram;

public class RepeatativeWord {

	public static void main(String[] args) {
		String str="We work to live and live to be happy";
		String word1="live";
		check(str, word1);

	}
	public static void check(String str,String word1) {
		String[] str1 = str.split(" ");
		int count=0;
		for(int i=0;i<str1.length;i++) {
			if(word1.equals(str1[i])) {
				count++;
			}
		}
        System.out.println("The word '" + word1 + "' is repeated " + count + " times in the given string.");
	}

}
