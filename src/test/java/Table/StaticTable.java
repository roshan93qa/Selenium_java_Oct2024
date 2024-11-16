package Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		List<WebElement> printAllTable = driver.findElements(By.xpath("//table[@id=\"table1\"]//tr/td[1]"));
		System.out.println(printAllTable.size());
		for(WebElement e:printAllTable) {
			String text = e.getText();
			System.out.println(text);
		}
		
		
		
	}

	

}
