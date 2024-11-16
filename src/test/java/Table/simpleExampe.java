package Table;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleExampe {
	static WebDriver driver;
public static void main(String[] args) throws AWTException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://qavbox.github.io/demo/webtable/");
//============================================================
		String cName = getIssueTracker("Bugzilla");
		System.out.println(cName);
		

}

public static String  getIssueTracker(String track ) {
return driver.findElement(By.xpath("//td[text()='"+track+"']//preceding-sibling::td//following-sibling::td[text()='Functional']")).getText();
}

}