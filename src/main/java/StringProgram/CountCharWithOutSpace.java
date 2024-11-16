package StringProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountCharWithOutSpace {

	public static void main(String[] args) {
		String s="I am Java developer";
		String s1=s.replaceAll(" ", "");
		System.out.println(s1.length());

	}

}
