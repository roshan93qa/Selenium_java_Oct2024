package DateAndTime;

import java.util.Date;

public class dateAndTime {

	public static void main(String[] args) {
		Date date=new Date();
		   String OriginalDate = date.toString();
		   System.out.println(OriginalDate);
		String email = date.toString().replace("", "-").replace(":", "_").concat("@gmail.com");
		System.out.println(email);

	}

}
