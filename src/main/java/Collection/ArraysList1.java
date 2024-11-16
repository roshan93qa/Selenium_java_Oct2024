package Collection;
import java.util.ArrayList;

public class ArraysList1 {

	public static void main(String[] args) {
		  
		    ArrayList<Integer> empList = new ArrayList<Integer>();
		    empList.add(10);
		    empList.add(30);
		    empList.add(20);
		    empList.add(50);
		    empList.add(60);
		    System.out.println(empList);
		    empList.set(0, 80);
		    System.out.println(empList);
		    empList.remove(0);
		    System.out.println(empList);
		    
		    
	}

}
