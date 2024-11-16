package String_30_10;

public class LonestWord {

	public static void main(String[] args) {
		String s="i am java developer";
	    int len = s.replaceAll(" ", "").length();
	    System.out.println(len);
	    String  s1[]=s.split(" ");
	    System.out.println(s1.length);
	    
	    for(int i=0;i<s1.length;i++) {
	    	System.out.print(s1[i]+"=");
	    	System.out.println(s1[i].length());
	    }
	    int max=0;
	    for(int i=0;i<s1.length;i++) {
	    	if(s1[i].length()>max) {
	    		max=s1[i].length();
	    	}
	    }
	    System.out.println("The longest word of string is : "+max);
	    
	    
	    
	}
	    

}
