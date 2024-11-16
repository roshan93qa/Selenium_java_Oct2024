package String_30_10;

public class RepeatativeChar {

	public static void main(String[] args) {
		String s="I am java developer";
		char s1[] =s.toUpperCase().toCharArray();
		
	    for(char ch='A';ch<'Z';ch++) {
	    	int count=0;
	    	for(int i=0;i<s1.length;i++) {
	    		if(ch==s1[i]) {
	    			count++;
	    		}
	    	}
	    	if(count>0) {
	    		System.out.println(ch+"="+count);
	    	}
	    }
		  
		
	}

}
