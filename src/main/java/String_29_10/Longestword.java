package String_29_10;

public class Longestword {

	public static void main(String[] args) {
	      String s="i am java developer";
	      System.out.println(s.length());
	      String s1[]=s.split(" ");
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
          System.out.println("The longest word of the string is == "+max);
	}

}
